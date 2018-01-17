<template>
    <div class="content-page">
        <div class="content">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <h4 class="page-title">发布新页面</h4>
                    </div>
                    <div class="col-md-12">
                        <form id="actionForm" role="form" novalidate="novalidate">
                            <div class="form-group col-md-6">
                                <input type="text" class="form-control" placeholder="请输入页面标题" required="" aria-required="true" />
                            </div>
                            <div class="form-group col-md-6">
                                <input type="text" class="form-control" placeholder="请输入页面访问名" required="" aria-required="true" />
                            </div>
                            <div class="clearfix"></div>
                            <div class="form-group">
                                <div id="editor">
                                    <mavon-editor
                                        :subfield = "subfield"
                                        :ishljs="true"
                                        :external_link="external_link"
                                        style="height: 100%;" v-on:save="save">
                                    </mavon-editor>
                                </div>
                            </div>
                            <div class="form-group text-right">
                                <button type="button" class="btn btn-primary waves-effect waves-light">保存页面</button>
                                <button type="button" class="btn btn-warning waves-effect waves-light">存为草稿</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    import {mavonEditor} from 'mavon-editor';
    import 'mavon-editor/dist/css/index.css';
    export default {
        name: 'PageEdit',
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
                }
            };
        },
        components: {
            mavonEditor
            // or 'mavon-editor': mavonEditor
        },
        methods: {
            save: function (value, render) {
                //  alert(render + " || " + value);
            }
        },
        mounted: function () {
            mavonEditor.mixins[0].data().s_markdown;
        }
    };

</script>
<style>
    @import "../../static/css/bootstrap.css";
    @import "../../static/css/font-awesome.css";
    @import "../../static/css/style.min.css";
    #editor {
        margin: auto;
        width: 98%;
        height: 580px;
    }
</style>
