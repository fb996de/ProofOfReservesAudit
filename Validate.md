# 用户验证资产示例

## 1. 用户验证示例

如果用户钱包中，有一定数量的BTC，那么用户可以验证自己的BTC资产。

#### (1) 用户打开平台网页，获取自己的用户ID(UID)、随机数(Nonce)、余额(Amount)。

- UID: 1001 ==> 1001
- Nonce: 184215605502167040 ==> 184215605502167040
- Amount: 10.12345678 ==> 10.12345678


#### (2) 计算字符串= str(UID) + "&" + str(CurrencyName)  + "&" + str(Amount)  + "&" + str(Nonce) 

userId + "&" + currencyName + "&" + balance + "&" + nonce;

字符串 = "1001" + "&" + "btc" + "&" + "10.12345678" + "&" + "184215605502167040"
       = "1001&btc&10.12345678&184215605502167040"

#### (3) 计算hash值

hash计算采用SHA256算法，用户可以使用第三方在线Hash算法工具或样例中提供的工具计算SHA256值。

SHA256("1001&btc&10.12345678&184215605502167040") = b75f3506582bd95ac6c30b4d95e87a4c67e97a801da974dd3fe89f5cd08b4595


**注意：结果不区分大小写**

#### (4) 在页面中查找用户HASH

证毕。

## 2. 第三方Hash计算工具（Online） 

- [https://tool.oschina.net/encrypt?type=2](https://tool.oschina.net/encrypt?type=2)
