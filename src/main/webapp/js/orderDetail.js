var Main = {
	data() {
		return {
			orderData:[{
				ORDERID: '15461468186',
				ADDRESS: '1号桌',
				TOTALPRICE: '177'
			}],
			tableData: [{
				FOODID:'14978978288',
				FOODNAME:'鱼香肉丝',
				FPRICE:'27',
				FCOUNT:'1',
				FTOTALPRICE:'27'
			},
			{
				FOODID:'15686846568',
				FOODNAME:'宫保鸡丁',
				FPRICE:'20',
				FCOUNT:'3',
				FTOTALPRICE:'60'
			},{
				FOODID:'87864545458',
				FOODNAME:'水煮鱼',
				FPRICE:'30',
				FCOUNT:'3',
				FTOTALPRICE:'90'
			}]
		}
	},
	methods:{
		backpage(){
			window.history.back(-1)
		}
	}
}
var Ctor = Vue.extend(Main)
new Ctor().$mount('#app')