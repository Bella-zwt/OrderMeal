var Main = {
    data() {
      const item = {
        date: '2016-05-02',
        name: '王小虎',
        address: '上海市普陀区金沙江路 1518 弄'
      };
      return {
        tableData: Array(20).fill(item)
      }
    },
    methods:{
    	toOrder(){
    		var frame=document.getElementById("frame");
    		frame.src="/OrderMeal/iframe/order";
    	},
    	toAddfood(){
    		var frame=document.getElementById("frame");
    		frame.src="/OrderMeal/iframe/addfood";
    	},
    	toChangefood(){
    		var frame=document.getElementById("frame");
    		frame.src="/OrderMeal/iframe/changefood";
    	},
    	toAddtype(){
    		var frame=document.getElementById("frame");
    		frame.src="/OrderMeal/iframe/addtype";
    	},
    	toChecktype(){
    		var frame=document.getElementById("frame");
    		frame.src="/OrderMeal/iframe/checktype";
    	},
    	toAdminlist(){
    		var frame=document.getElementById("frame");
    		frame.src="/OrderMeal/iframe/adminlist";
    	},
    	toAddadmin(){
    		var frame=document.getElementById("frame");
    		frame.src="/OrderMeal/iframe/addadmin";
    	},
    	toLunbo(){
    		var frame=document.getElementById("frame");
    		frame.src="/OrderMeal/iframe/lunbo";
    	}
    }
  };
var Ctor = Vue.extend(Main)
new Ctor().$mount('#app')
var listbody=document.getElementById("listbody");
var header=document.getElementById("header");
var str=header.style.height.split("p")[0];
var height=window.innerHeight-str+"px";
listbody.style.height=height;
var frame=document.getElementById("frame");
frame.style.width=window.innerWidth-200+"px";
