var comments = Vue.component('app-comment', function(resolve, reject){
    $.get("../../templates/admin/comment_list.html").then(function(res){
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