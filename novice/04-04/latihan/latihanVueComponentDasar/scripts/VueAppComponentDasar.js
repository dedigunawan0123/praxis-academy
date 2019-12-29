// dg. Ini pembuatan component
Vue.component('button-counter', {
    data: function() {
        return {
            count: 0
        }
    },
    template: '<button v-on:click="count++">Anda mengklik saya {{ count }} kali.</button>'
})

// dg. Ini penggunaan component, dengan membuat objectnya
new Vue({ el: '#app-6' })