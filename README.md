# training

用Spring Framework & MyBatis & MySQL & RabbitMQ & Redis 實作以下功能

1. 實作一個登入API，當帳號密碼與DB的一致時，Access Token，不一致時，回傳錯誤訊息，
2. 將Access Token存進Redis，多重登入時使用後踢前的策略
3. 使用Pub/Sub方式，將用戶登入的結果記錄在DB或Log File
4. 實作一個個人資訊 REST API，當Access Token可用時，回傳用戶的顯示名稱，不可用時，回傳錯誤訊息
5. 實作一個登出 API，讓Access Token失效

業界的先進您好：

MyBatis、RabbitMQ、Redis在現階段工作上並沒有使用過，因此花費了不少時間在研究這些工具，在時間限制上，有太多工具需要學習，無法將此專案順利完成。
MyBatis似乎有兩種使用方式一種是我在專案裡面使用的方法，另一種是建置xml來使用，但是建置xml的方式，一直無法正確的將方法指向至xml檔案，導致查詢失敗。
Redis網路上的教學在Linux建置，在沒有使用spring boot security時可以成功將數據暫存在redis
Pub/Sub 以我目前的認知是在Linux上操作redis-cli進行，登入後當用戶資訊傳送至DB進行儲存。
spring boot security的部分不夠熟悉，在目前的工作上這部分公司既有的框架已經相當完整很少進行更動，這個專案導致當入無法成功的原因，應該是
WebSecurityConfig裡面的configure設定設有些問題，導致無法登入。
第4跟第5點由於無法登入沒有辦法確定實作有沒有成功。

如果願意再給我一個禮拜的時間，我想我應該可以順利完成這個專案，謝謝。
