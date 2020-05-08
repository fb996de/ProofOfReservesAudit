## 100%提现兑付能力证明

本设计用于证明平台拥有100%的用户资产储备金。

我们有责任和义务解决用户对于数字资产平台透明度的要求。

## 证明机制

#### 步骤一 公布平台资产
平台公布资产的持币地址，证明其拥有的资产储备总额数量。

#### 步骤二 生成用户节点数据
平台根据用户的资产数据，通过如下步骤生成用户结点数据：
* 每个用户具有 `userid,amount`
* 通过算法为每个用户生成 `userid,amount,nonce,hash`
hash函数为
```
    hash(String userId, String currencyName, String balance, String nonce) {
        String hashString = userId + "&" + currencyName + "&" + balance + "&" + nonce;
        return sha256Hex(hashString);
    }
```

#### 步骤三 用户验证资产
* 用户可以下载平台完整的账户数据。
* 用户可以根据平台端展示的userid,amount,nonce等相关数据，按照上述描述的hash函数，自行计算hash，然后自行搜索查找，证明用户资产在平台公布的储备数字资产中。
* 用户可以公布上述过程与数据。
具体示例可以参考 [验证示例](./Validate.md)

所有用户都可以采用上述流程进行验证。
* 所有用户都能确认自己的资产数目在平台公布的储备资产数据中。
* 没有任何用户提出资产数据被重复验证或者伪造。
* 在上述两点满足的情况下，通过上述步骤即可证明平台拥有100%储备数字资产。
