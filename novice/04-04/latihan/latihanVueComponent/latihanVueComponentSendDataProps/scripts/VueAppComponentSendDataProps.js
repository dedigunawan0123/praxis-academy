// dg. Ini pembuatan component
Vue.component('blog-post', {
    props: ['title'],
    template: '<h3>{{ title }}</h3>'
})

// dg. Ini penggunaan component, dengan membuat objectnya
new Vue({ el: '#app-6' })