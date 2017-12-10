
var attach = Vue.component('app-attach', function(resolve, reject){
    $.get("../../templates/admin/attach.html").then(function(res){
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