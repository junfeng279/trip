var publishs = Vue.component('app-publish', function (resolve, reject) {
    $.get("../../templates/admin/article_edit.html").then(function (res) {
        resolve({
            template: res,
            data: function () {
                return {}
            },
            methods: {
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



