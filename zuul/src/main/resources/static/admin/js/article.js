
var articles = Vue.component('app-article', function(resolve, reject){
    $.get("../../templates/admin/article_list.html").then(function(res){
        resolve({
            template: res,
            data: function(){
                return {
                }
            },
            methods: {

            }
        });
    });
});