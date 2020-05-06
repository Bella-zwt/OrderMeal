var Main = {
	data() {
		return {
			tableData: [{
				ORDERID: '15461468186',
				NICKNAME: '赵婉婷',
				ADDRESS: '1号桌',
				TOTALPRICE: '177',
				ORDERSTATE: '已完成',
				ORDERTIME: '2020-4-27'
			}, {
				ORDERID: '15461468186',
				NICKNAME: '赵婉婷',
				ADDRESS: '1号桌',
				TOTALPRICE: '177',
				ORDERSTATE: '已完成',
				ORDERTIME: '2020-4-27'
			}, {
				ORDERID: '15461468186',
				NICKNAME: '赵婉婷',
				ADDRESS: '1号桌',
				TOTALPRICE: '177',
				ORDERSTATE: '已完成',
				ORDERTIME: '2020-4-27'
			}, {
				ORDERID: '15461468186',
				NICKNAME: '赵婉婷',
				ADDRESS: '1号桌',
				TOTALPRICE: '177',
				ORDERSTATE: '已完成',
				ORDERTIME: '2020-4-27'
			}]
		}
	},
	methods: {
		toOrderDetail() {
			window.location.href="/OrderMeal/iframe/orderDetail";
		}
	}
}
var Ctor = Vue.extend(Main)
new Ctor().$mount('#app')