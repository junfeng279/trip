
var index = new Vue({
    el: "#wrapper",
    data: {
        currentView: home
    },
    methods: {
        changemenu: function(data){
            this.currentView = data;
        }
    },
    components: {
        home: home,
        articles: articles,
        publishs: publishs,
        comments: comments,
        category: category
    }
});