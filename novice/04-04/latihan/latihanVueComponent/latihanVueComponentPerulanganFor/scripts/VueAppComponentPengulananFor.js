// dg. Ini pembuatan component
Vue.component('blog-post', {
    props: ['title'],
    template: '<h3>{{ title }}</h3>'
})

// dg. Ini penggunaan component, dengan membuat objectnya
new Vue({
    el: '#app-6',
    data: {
        posts: [
            { id: 1, title: 'Perjalanan saya dengan Vue' },
            { id: 2, title: 'Blogging dengan Vue' },
            { id: 3, title: 'Mengapa Vue sangat menyenangkan' }
        ]
    }
})