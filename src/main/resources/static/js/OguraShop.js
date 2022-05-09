
 
 $(function(){

var str='在庫なし';


 if (str == '在庫あり' ) { 
        // ボタンを有効化
        $('#buy-button').prop('disabled', false);
    } else { 
        // ボタンを無効化
        $('#buy-button').prop('disabled', true); 
    }


});