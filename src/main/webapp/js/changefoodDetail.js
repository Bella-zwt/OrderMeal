var url = decodeURI(location.search);
var info=url.split("=");
var FOODNAME=info[1].split("&")[0];
var FOODPRICE=info[2].split("&")[0];
var MEMBERPRICE=info[3].split("&")[0];
var TYPEID=info[4].split("&")[0];
var FOODINFO=info[5].split("&")[0];
var FOODIMG=info[6];

var Main = {
	data() {
		return {
			textarea: FOODINFO,
			options: [{
				value: '选项1',
				label: '饭后甜品'
			}, {
				value: '选项2',
				label: '酒水饮料'
			}, {
				value: '选项3',
				label: '精品凉菜'
			}, {
				value: '选项4',
				label: '精品热菜'
			}, {
				value: '选项5',
				label: '精致主食'
			}],
			value: TYPEID,
			input1: FOODNAME,
			input2: FOODPRICE,
			input3: MEMBERPRICE,
			fileList: [{
				url:FOODIMG
			}]
		}
	},
	methods: {
		handleRemove(file, fileList) {
			console.log(file, fileList);
		},
		handlePreview(file) {
			console.log(file);
		},
		backpage(){
			window.history.back(-1);
		}
	}
}
var Ctor = Vue.extend(Main)
new Ctor().$mount('#app')

