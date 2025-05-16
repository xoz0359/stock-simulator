package co.min.stock_simulator.DTO.KIS.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OAuthTokenRequest {
    //@JsonProperty는 단순히 JSON의 Key와 Filed를 매핑해주는 역할을 합니다

    @JsonProperty("grant_type")
    private String grantType;

    @JsonProperty("appkey")
    private String appKey;

    @JsonProperty("appsecret")
    private String appSecret;

    public OAuthTokenRequest() {
    }

    public OAuthTokenRequest(String grantType, String appKey, String appSecret) {
        this.grantType = grantType;
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}
