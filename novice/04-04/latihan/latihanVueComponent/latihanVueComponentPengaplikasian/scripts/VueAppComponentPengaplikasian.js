// dg. Ini pembuatan component
Vue.component('blog-post', {
    props: ['title'],
    template: '<h3>{{ title }}</h3>'
})


// dg. Ini penggunaan component, dengan membuat objectnya
new Vue({
    el: '#app-6',
    data: {
        posts: []
    },
    created: function() {
        // Alias the component instance as `vm`, so that we  
        // can access it inside the promise function
        var vm = this
            // Fetch our array of posts from an API
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(function(response) {
                return response.json()
            })
            .then(function(data) {
                vm.posts = data
            })
    }
})