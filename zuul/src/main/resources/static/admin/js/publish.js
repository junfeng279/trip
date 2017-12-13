var publishs = Vue.component('app-publish', function (resolve, reject) {
    $.get("../../templates/admin/article_edit.html").then(function (res) {
        resolve({
            template: res,
            data: function () {
                return {
                    categories: '',
                    cid: '',
                    status: '',
                    content: '',
                    title: '',
                    slug: '',
                    tags: ''
                }
            },
            methods: {
                reloadarticle: function(data){
                    this.$emit("reloadarticle", data);
                },
                subArticle: function(data){
                    debugger;
                    var tt = $('.tag>span').text().replace(/^\s+|\s+$/gm,'');
                    var tagss = tt.replace(/\s+/g,",");
                    var cc = $('#multiple-sel').val();
                    var categoriess = '';
                    for(var i=0; i<cc.length; i++){
                        if(i==(cc.length-1)){
                            categoriess = categoriess+cc[i];
                        }else{
                            categoriess = categoriess+cc[i]+','
                        }

                    }
                    if(this.title==''){
                        alert('标题不能为空');
                        return;
                    }
                    if(this.content==''){
                        alert('内容不能为空');
                        return;
                    }
                    if(tagss=='' || tagss==undefined){
                        alert('请添加标签');
                        return;
                    }
                    if(categories=='' || categoriess==undefined){
                        alert('请添加分类信息');
                        return;
                    }
                    var params = {
                        title: this.title,
                        slug: this.slug,
                        status: data,
                        tags: tagss,
                        categories: categoriess,
                        allowComment: $('#allowComment').val(),
                        allowPing: $('#allowPing').val(),
                        allowFeed: $('#allowFeed').val(),
                        content: this.content
                    }

                    var url = '/wantrip/article/publish';
                    var user_token = getCookie("user_token");
                    var _this = this;
                    $.ajax({
                        url: url,
                        type: "POST",
                        dataType: "json",
                        data: JSON.stringify(params),
                        contentType: 'application/json',
                        headers: {
                            'Authorization': 'Bearer '+user_token
                        },
                        success: function(data){
                            swal({
                                title: '添加文章成功',
                                showConfirmButton: true,
                                showCancelButton: true,
                                html: $('<div>')
                                    .addClass('some-class')
                                    .text('是否继续添加？'),
                                animation: false,
                                customClass: 'animated tada'
                            }).then(function(result){
                                if(result.value){
                                    _this.reloadarticle('publishs');
                                }else{
                                    window.location.href="../../templates/admin/index.html";
                                }
                            });
                        },
                        error: function(data){

                        }
                    });
                },
                allowComment: function (event) {
                    //获取点击对象
                    var el = event.currentTarget;
                    var this_ = $(el);
                    var on = this_.find('.toggle-on.active').length;
                    var off = this_.find('.toggle-off.active').length;
                    if (on == 1) {
                        $('#allowComment').val(false);
                    }
                    if (off == 1) {
                        $('#allowComment').val(true);
                    }
                    alert($('#allowComment').val());
                },
                allowPing: function (event) {
                    var el = event.currentTarget;
                    var this_ = $(el);
                    var on = this_.find('.toggle-on.active').length;
                    var off = this_.find('.toggle-off.active').length;
                    if (on == 1) {
                        $('#allowPing').val(false);
                    }
                    if (off == 1) {
                        $('#allowPing').val(true);
                    }
                },
                allowFeed: function (event) {
                    var el = event.currentTarget;
                    var this_ = $(el);
                    var on = this_.find('.toggle-on.active').length;
                    var off = this_.find('.toggle-off.active').length;
                    if (on == 1) {
                        $('#allowFeed').val(false);
                    }
                    if (off == 1) {
                        $('#allowFeed').val(true);
                    }
                },
                initMarkdown: function(){
                    this.$nextTick(function(){
                        var textarea = $('#text'),
                            toolbar = $('<div class="markdown-editor" id="md-button-bar" />').insertBefore(textarea.parent())
                        preview = $('<div id="md-preview" class="md-hidetab" />').insertAfter('.markdown-editor');
                        markdown(textarea, toolbar, preview);
                    });
                },
                initOther: function(){
                    this.$nextTick(function(){
                        // Tags Input
                        $('#tags').tagsInput({
                            width: '100%',
                            height: '35px',
                            defaultText: '请输入文章标签'
                        });

                        $('.toggle').toggles({
                            on: true,
                            text: {
                                on: '开启',
                                off: '关闭'
                            }
                        });

                        $(".select2").select2({
                            width: '100%'
                        });

                        $('div.allow-false').toggles({
                            off: true,
                            text: {
                                on: '开启',
                                off: '关闭'
                            }
                        });
                    });
                }
            },
            created: function () {

            },
            mounted: function () {
                this.initMarkdown();
                this.initOther();
            }
        });
    });
});
