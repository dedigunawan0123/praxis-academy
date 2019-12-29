// dg. Ini pembuatan component
Vue.component('blog-post', {
    props: ['post'],
    template: `
      <div class="blog-post">
        <h3>{{ post.title }}</h3>
        <div v-html="post.content"></div>
      </div>
    `
})

// dg. Ini penggunaan component, dengan membuat objectnya
new Vue({
    el: '#app-6',
    data: {
        posts: [
            { id: 1, title: 'Perjalanan saya dengan Vue', content: 'Content1' },
            { id: 2, title: 'Blogging dengan Vue', content: 'Content2' },
            { id: 3, title: 'Mengapa Vue sangat menyenangkan', content: 'Content3' }
        ]
    }
})