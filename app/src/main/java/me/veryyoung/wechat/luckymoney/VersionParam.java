package me.veryyoung.wechat.luckymoney;


public class VersionParam {

    public static final String WECHAT_PACKAGE_NAME = "com.tencent.mm";

    public static String receiveUIFunctionName = "c";

    /**
     * last param of receiveUIFunctionName for class luckyMoneyReceiveUI
     */
    public static String receiveUIParamName = "com.tencent.mm.ah.m";

    /**
     * Search MMCore has not been initialize ?
     */
    public static String networkRequest = "com.tencent.mm.model.av";

    /**
     * Search MMCore has not been initialize ? next function of networkRequest
     */
    public static String getNetworkByModelMethod = "LZ";


    public static String luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";

    /**
     * Search jSONObject.optString("timingIdentifier")
     */
    public static String receiveLuckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.c.ao";


    /**
     * Search hashMap.put("timingIdentifier", str
     */
    public static String luckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.c.al";

    /**
     * search /cgi-bin/mmpay-bin/transferoperation
     */
    public static String getTransferRequest = WECHAT_PACKAGE_NAME + ".plugin.remittance.model.u";


    public static boolean hasTimingIdentifier = false;


    public static void init(String version) {
        switch (version) {
            case "6.6.0":
            case "6.6.1":
                receiveUIFunctionName = "d";
                receiveUIParamName = "com.tencent.mm.ad.k";
                networkRequest = "com.tencent.mm.y.as";
                getNetworkByModelMethod = "ys";
                receiveLuckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.b.ae";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                luckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.b.ab";
                getTransferRequest = WECHAT_PACKAGE_NAME + ".plugin.remittance.c.l";
                hasTimingIdentifier = true;
                break;
            case "6.6.2":
            case "6.6.3":
                receiveUIFunctionName = "d";
                receiveUIParamName = "com.tencent.mm.ae.k";
                networkRequest = "com.tencent.mm.z.ar";
                getNetworkByModelMethod = "CG";
                receiveLuckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.b.af";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                luckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.b.ac";
                getTransferRequest = WECHAT_PACKAGE_NAME + ".plugin.remittance.model.s";
                hasTimingIdentifier = true;
                break;
            case "6.6.5":
                receiveUIFunctionName = "d";
                receiveUIParamName = "com.tencent.mm.ac.l";
                networkRequest = "com.tencent.mm.y.as";
                getNetworkByModelMethod = "CN";
                receiveLuckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.b.af";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                luckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.b.ac";
                getTransferRequest = WECHAT_PACKAGE_NAME + ".plugin.remittance.model.t";
                hasTimingIdentifier = true;
                break;
            case "6.6.6":
                receiveUIFunctionName = "d";
                receiveUIParamName = "com.tencent.mm.ac.l";
                networkRequest = "com.tencent.mm.z.au";
                getNetworkByModelMethod = "Dv";
                receiveLuckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.b.af";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                luckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.b.ac";
                getTransferRequest = WECHAT_PACKAGE_NAME + ".plugin.remittance.model.u";
                hasTimingIdentifier = true;
                break;
            case "6.6.7":
                receiveUIFunctionName = "d";
                receiveUIParamName = "com.tencent.mm.ab.l";
                networkRequest = "com.tencent.mm.model.au";
                getNetworkByModelMethod = "DF";
                receiveLuckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.b.ag";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                luckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.b.ad";
                getTransferRequest = WECHAT_PACKAGE_NAME + ".plugin.remittance.model.u";
                hasTimingIdentifier = true;
                break;
            case "6.7.2":
                receiveUIFunctionName = "c";
                receiveUIParamName = "com.tencent.mm.af.m";
                networkRequest = "com.tencent.mm.model.av";
                getNetworkByModelMethod = "CB";
                receiveLuckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.b.ag";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                luckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.b.ad";
                getTransferRequest = WECHAT_PACKAGE_NAME + ".plugin.remittance.model.u";
                hasTimingIdentifier = true;
                break;
            case "6.7.3":
                receiveUIFunctionName = "c";
                receiveUIParamName = "com.tencent.mm.ai.m";
                networkRequest = "com.tencent.mm.model.au";
                getNetworkByModelMethod = "Dn";
                receiveLuckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.b.ag";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                luckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.b.ad";
                getTransferRequest = WECHAT_PACKAGE_NAME + ".plugin.remittance.model.u";
                hasTimingIdentifier = true;
                break;
            case "7.0.0":
                receiveUIFunctionName = "c";
                receiveUIParamName = "com.tencent.mm.ah.m";
                networkRequest = "com.tencent.mm.model.av";
                getNetworkByModelMethod = "LZ";
                receiveLuckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.c.ao";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI";
                luckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.c.al";
                getTransferRequest = WECHAT_PACKAGE_NAME + ".plugin.remittance.model.u";
                hasTimingIdentifier = true;
                break;
            default:
                receiveUIFunctionName = "c";
                receiveUIParamName = "com.tencent.mm.ah.m";
                networkRequest = "com.tencent.mm.model.av";
                getNetworkByModelMethod = "LZ";
                receiveLuckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.c.ao";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI";
                luckyMoneyRequest = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.c.al";
                getTransferRequest = WECHAT_PACKAGE_NAME + ".plugin.remittance.model.u";
                hasTimingIdentifier = true;
        }
    }
}
