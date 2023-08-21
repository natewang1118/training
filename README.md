# training

用Spring Framework & MyBatis & MySQL & RabbitMQ & Redis 實作以下功能

1. 實作一個登入API，當帳號密碼與DB的一致時，Access Token，不一致時，回傳錯誤訊息，
2. 將Access Token存進Redis，多重登入時使用後踢前的策略
3. 使用Pub/Sub方式，將用戶登入的結果記錄在DB或Log File
4. 實作一個個人資訊 REST API，當Access Token可用時，回傳用戶的顯示名稱，不可用時，回傳錯誤訊息
5. 實作一個登出 API，讓Access Token失效

業界的先進您好：晚了這麼多天才繳交給你，在linux設定rabbitMq花了不少時間在研究，雖然目前這樣子我認為只有成功了一半，
還有許多東西在短時間之類可能無法研究出來，因此還是先繳交給您了，要觸發rabbitMq的網址為localhost:8080/admin。
另外mvn package確定可以成功。