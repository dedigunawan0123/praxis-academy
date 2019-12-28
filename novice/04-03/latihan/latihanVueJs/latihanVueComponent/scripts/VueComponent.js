Vue.component('todo-item', {
    // Sekarang todo-item dapat menerma "prop",
    // yaitu suatu attribute yg custom
    // Prop ini disebut todo
    props: ['todo'],
    template: '<li>{{ todo.text }}</li>'
})


var app7 = new Vue({
    el: '#app-7',
    data: {
        groceryList: [
            { id: 0, text: 'Vegetables' },
            { id: 1, text: 'Cheese' },
            { id: 2, text: 'Whatever else human are supposed to eat' }
        ]
    }
})