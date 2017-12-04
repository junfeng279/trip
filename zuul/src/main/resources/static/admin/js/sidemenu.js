

( function( window ) {
    'use strict';
    var sidemenu = new Vue({
        el: "#side-menu",
        data: {
            menu: {
                index: "仪表盘",
                publish: "发布文章",
                article: "文章管理",
                page: "页面管理",
                comments: "评论管理",
                category: "分类/标签",
                attach: "文件管理",
                links: "友链管理",
                setting: "系统设置"
            },
            active: 'comments'
        },
        methods: {

        }
    });

})( window );
