var category = Vue.component('app-category', function(resolve, reject){
    $.get("../../templates/admin/category.html").then(function(res){
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