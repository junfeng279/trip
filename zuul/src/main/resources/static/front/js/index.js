

( function( window ) {

'use strict';


    var articleList = new Vue({
        el: "article-list",
        data: {
            articles: [],

        },
        methods: {
            getArticles: function(){
                var that = this;
                var url ='/wantrip/page/articles';
                var params = {
                    "page": 0,
                    "limit": 10,
                    "keyword": ""
                };
                $.ajax({
                    url: url,
                    type: "POST",
                    dataType: "json",
                    data: JSON.stringify(params),
                    contentType: 'application/json',
                    success: function(data){
                        alert(data);
                    },
                    error: function(data){
                       debugger;
                    }
                });
            }
        }
    });

    articleList.getArticles();

})( window );
