<template xmlns:v-on="" xmlns:v-bind="http://www.w3.org/1999/xhtml">
    <div class="content-page">
        <div class="content">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <h4 class="page-title">发布文章</h4>
                    </div>
                    <div class="col-md-12">
                        <div id="articleForm" role="form" novalidate="novalidate">
                            <div class="form-group col-md-6" style="padding: 0 10px 0 0;">
                                <input type="text" class="form-control" v-model="contentVo.title" placeholder="请输入文章标题(必填)" required="required"
                                aria-required="true"/>
                            </div>
                            <div class="form-group col-md-6" style="padding: 0 0 0 10px;">
                                <input type="text" class="form-control" v-model="contentVo.slug" placeholder="自定义访问路径, 如：my-first-article 默认为文章id">
                            </div>
                            <div class="form-group col-md-6" style="padding: 0 10px 0 0;">
                                <input type="text" class="form-control" v-model="contentVo.tags" id="tags" placeholder="请填写文章标签"/>
                            </div>
                            <div class="form-group col-md-6">
                                <select id="multiple-sel" class="select2 form-control" v-model="contentVo.categories">
                                    <option value="default">请选择分类...</option>
                                    <option value="default">默认分类1</option>
                                    <option value="default">默认分类2</option>
                                </select>
                            </div>
                            <div class="clearfix"></div>
                            <div class="form-group">
                                <div id="editor">
                                    <mavon-editor
                                        :subfield = "subfield"
                                        :ishljs="true"
                                        :external_link="external_link"
                                    style="height: 100%;" v-on:save="save" v-on:change="change"></mavon-editor>
                                </div>
                            </div>
                            <div class="form-group col-md-3 col-sm-4">
                                <label class="col-sm-4">开启评论</label>
                                <div class="col-sm-8">
                                    <div class="toggle toggle-success" v-bind:class="[contentVo.allowComment?'allow-true':'allow-false']" v-on:click="allowCommentData"></div>
                                </div>
                            </div>
                            <div class="form-group col-md-3 col-sm-4">
                                <label class="col-sm-5">允许Ping</label>
                                <div class="col-sm-7">
                                    <div class="toggle toggle-success" v-bind:class="[contentVo.allowPing?'allow-true':'allow-false']" v-on:click="allowPingData"></div>
                                </div>
                            </div>
                            <div class="form-group col-md-3 col-sm-4">
                                <label class="col-sm-4">允许订阅</label>
                                <div class="col-sm-8">
                                    <div class="toggle toggle-success" v-bind:class="[contentVo.allowFeed?'allow-true':'allow-false']" v-on:click="allowFeedData"></div>
                                </div>
                            </div>
                            <div class="clearfix"></div>
                            <div class="text-right">
                                <a class="btn btn-default waves-effect waves-light">返回列表</a>
                                <button class="btn btn-primary waves-effect waves-light" type="button" v-on:click="submit">保存文章</button>
                                <button class="btn btn-warning waves-effect waves-light" type="button">存为草稿</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    /* eslint-disable no-unused-vars,no-undef,space-before-function-paren,no-empty-function,space-before-blocks,quotes,dot-notation,dot-notation */
    import {mavonEditor} from 'mavon-editor';
    import 'mavon-editor/dist/css/index.css';
    import $ from 'jquery';
    import tags from '../../static/plugin/tagsinput/jquery.tagsinput.min';
    import toggles from '../../static/js/toggles';
    import swal from '../../static/js/select2';
    import {getCookie} from '../../static/js/cookieUtil';

    export default {
        name: 'Publish',
        data: function () {
            return {
                subfield: true,
                external_link: {
                    markdown_css: function () {
                        // 这是你的markdown css文件路径
                        return '/markdown/github-markdown.min.css';
                    },
                    hljs_js: function () {
                        // 这是你的hljs文件路径
                        return '/highlightjs/highlight.min.js';
                    },
                    hljs_css: function (css) {
                        // 这是你的代码高亮配色文件路径
                        return '/highlightjs/styles/' + css + '.min.css';
                    },
                    hljs_lang: function (lang) {
                        // 这是你的代码高亮语言解析路径
                        return '/highlightjs/languages/' + lang + '.min.js';
                    },
                    katex_css: function () {
                        // 这是你的katex配色方案路径路径
                        return '/katex/katex.min.css';
                    },
                    katex_js: function () {
                        // 这是你的katex.js路径
                        return '/katex/katex.min.js';
                    },
                },
                contentVo: {
                    title: '',
                    slug: '',
                    tags: 'aa,bb,cc',
                    categories: '',
                    content: '',
                    allowComment: true,
                    allowPing: true,
                    allowFeed: true
                }
            };
        },
        mounted: function () {
            var _this = this;
            mavonEditor.mixins[0].data().s_markdown;
            $('#tags').tagsInput({
                width: '100%',
                height: '35px',
                defaultText: '请输入文章标签',
                onAddTag: function(tag){
                    if (_this.contentVo.tags !== '') {
                        _this.contentVo.tags = _this.contentVo.tags + ',' + tag;
                    } else {
                        _this.contentVo.tags = tag;
                    }

                 //   alert(_this.contentVo.tags);
                }
            });

            $('.toggle').toggles({
                on: true,
                text: {
                    on: '开启',
                    off: '关闭'
                }
            });
            $('div.allow-false').toggles({
                off: true,
                text: {
                    on: '开启',
                    off: '关闭'
                }
            });
        },
        components: {
            mavonEditor
            // or 'mavon-editor': mavonEditor
        },
        methods: {
            save: function(value, render){
              //  alert(render + " || " + value);
            },
            change: function(value, render){
                this.contentVo.content = render;
            },
            allowCommentData: function(){
                this.contentVo.allowComment = !this.contentVo.allowComment;
            },
            allowPingData: function(){
                this.contentVo.allowPing = !this.contentVo.allowPing;
                alert(this.contentVo.allowPing);
            },
            allowFeedData: function(){
                this.contentVo.allowFeed = !this.contentVo.allowFeed;
            },
            submit: function(){
                if (this.contentVo.title === '') {
                    alert('文章标题不能为空');
                }
                if (this.contentVo.slug === '') {
                    alert('文章路径不能为空');
                }

                var url = '/api/wantrip/article/publish';
                var params = {
                    title: this.contentVo.title,
                    slug: this.contentVo.slug,
                    tags: this.contentVo.tags,
                    categories: this.contentVo.categories,
                    content: this.contentVo.content,
                    allowComment: this.contentVo.allowComment,
                    allowPing: this.contentVo.allowPing,
                    allowFeed: this.contentVo.allowFeed
                };
                var _this = this;
                var token = getCookie('token');
                console.log(token);
                debugger;
                this.$ajax({
                    method: 'post',
                    url: url,
                    data: JSON.stringify(params),
                    headers: {
                        'Content-Type': 'application/json;charset=UTF-8',
                        'Authorization': 'Bearer-' + token
                    },
                    responseType: 'json'
                }).then(function (response) {
                    console.log(response);
                    swal('文章保存成功！', '继续添加', 'success');
                }).catch(function (error) {
                    console.log(error);
                    swal('文章保存失败！', '重新添加', 'error');
                });
            }
        }
    };

</script>
<style>
    @import "../../static/plugin/tagsinput/jquery.tagsinput.css";
    @import "../../static/plugin/toggles/toggles.css";
    @import "../../static/css/bootstrap.css";
    @import "../../static/css/font-awesome.css";
    @import "../../static/css/style.min.css";
    #editor {
        margin: auto;
        width: 100%;
        height: 580px;
    }
    #tags_tagsinput {
        background-color: #fafafa;
        border: 1px solid #eeeeee;
    }

    #tags_addTag input {
        width: 100%;
    }

    #tags_addTag {
        margin-top: -5px;
    }
</style>
