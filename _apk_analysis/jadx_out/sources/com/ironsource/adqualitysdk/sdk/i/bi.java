package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.applovin.adview.AdViewController;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.ironsource.G5;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class bi extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f820 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f821;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f822;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f823;

    static {
        char[] cArr = new char[2053];
        ByteBuffer.wrap("J|\u0090\u0000þ×Ä\u0096#f\tÊW\u009a²H\u0098\u0006æìÍT\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Ta&;ù\u0015\u009e\u0000cÚ\"´÷\u008eÉiUCñ\u001d¾øwÒ\u0007¬Ã\u0087ka!;²\u0015\u0088ðRÊõ¤¹\u007fxY\u001d3\u0099\u000eEè!Âî\u009c§wWQó+»\u0006qà-ºÝ\u0095Po:IÅ#\u009a\u0000AÚ)´Ì\u008e\u008eiQCö\u001d\u008døtÒ\u0006¬Á\u0087pa ;ð\u0015\u0085ðSÊñ\u0015\tÏu¡¢\u009bã|\u0013V¿\bïí=Çi¹\u0093\u0092>tb.¦\u0000Òå\nß¢±ìj<LC&\u0093\u001b\rýz×¢\u0089Êb\u0006D¤>î\u0013.\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ!¬Û\u0087va*;î\u0015\u009aðBÊê¤¤\u007ftY\u000b3Û\u000eEè5ÂÚ\u009c\u0082wYQé+½\u0006x\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Aa#;õ\u0015\u008að]ÊÏ¤¹\u007fnY\u001e3Ò\u000ejè4Âì\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Fa&;ï\u0015\u0099ðZÊâ¤©\u007fQY\u00033Ä\u000epè4Âð\u009c\u008ewJ$«þ×\u0090\u0000ªAM±g\u001d9MÜ\u009föÃ\u0088;£ºEÀ\u001f\u00011bÔ®î\r\u0080v[\u009e}ó\u0017)*\u008bÌÕæ\u0011¸s\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Ta&;ø\u0015\u008cðYÊÓ¤¼\u007f|Y\u00133Õ\u000eeè2Âõ\u009c§wQQö+¦\u0006zà\u0002ºÜ\u0095t\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Qa&;æ\u0015\u008c\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Va6;ì\u0015\u008c\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ!¬Û\u0087aa*;ò\u0015\u009dð_Êõ¤¹\u007fgY\u000f3Ó\u000eMè?Âê\u009c\u008ewJQö+¦\u0006và\u0018ºÐ\u0095go?\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ!¬Û\u0087va*;î\u0015\u009aðBÊê¤¤\u007ftY\u000b3Û\u000eEè5°øj\u0084\u0004S>\u0012ÙâóN\u00ad\u001eHÌb\u0086\u001ci7ÙÑ \u008bL¥5@øz{\u0014\nÏÐéº\u0083x¾ÔX\u009cr^\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Qa*;î\u0015\u009fð_Êà¤µ\u007fTY\u00073Ç\u000eh\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Ta&;ù\u0015\u009eðsÊõ¤µ\u007fsY\u001e3û\u000emè\"Âê\u009c\u008ewVQà+ 1Ùë¥\u0085r¿3XÃro,?Éíã¦\u009dD¶þP²\nk$'ÁÇû~\u0095?\u0000AÚ)´Ì\u008e\u008eiQCö\u001d\u008døtÒ\u0006¬Á\u0087pa ;ð\u0015\u0085ðSÊñ¤\u0099\u007fpY\u001a3ÛxU¢)Ìþö¿\u0011O;ãe³\u0080aª=ÔÅÿT\u0019:Cûm\u0098\u0000MÚ,´â\u008e¦iPC×\u001d§ø~Ò\u001fòì(\u008dFC|\u000f\u009bû±Tï\n\nÈ º^`uÊ\u0093\u009aÉTç)\u0002û8cV\u00154Âî£\u0080mº:]Þwy) Ìææ\u0083\u0098_³éU\u0081\u000fwú( IN\u0087tÃ\u00935¹²çÂ\u0002\u001b(zV\u0099}\n\u009bZÁ\u0095\u0000MÚ,´â\u008e¡iACí\u001d¢øhÒ\u000b¬Ç\u0087ga*;ò\u0015¨ðRÊÊ¤½\u007fmY\u0006\u0000MÚ,´â\u008e¦iPCà\u001d¾øoÒ\r¬Ç\u0087Ra.;î\u0015\u0088ð[Êæ¤¤\u007fxY\u00183Ä\u000eMè<Âî\u009c\u0087IW\u00932ýäÇ\u0094 O\nïT½±n\u009b\u001cåüÎ}('rð\\\u009a¹O\u0083üí\u00836j\u0010\u0000zÁ.Éô¨\u009af \"GÔmd3:Öëü\u0089\u0082C\r:×[¹\u0095\u0083Ñd'\u0000MÚ,´â\u008e¦iPCÇ\u001d¡øiÒ\u0005¬Ô\u0087v\u0000MÚ,´â\u008e¦iPCÍ\u001d§øhÒ\u001c¬Ð\u0087la*;î\u0000MÚ,´â\u008e¦iPC×\u001d§ø~Ò\u001f¬ô\u0087fa\u0003;õ\u0015\u009aðBÊæ¤¾\u007fxY\u0018\u0001pÛ\u0011µß\u008f\u0088hlBË\u001c\u0092ùTÓ1WÒ\u008d³ã}Ù*>Î\u0014iJ0¯ö\u0085\u0093ûOÐù6\u0091lgB:§À\u009doó;(ç\u000e\u009bdMYé\u0000MÚ(´þ\u008e\u008eiUCõ\u001d§øtÒ\u0006¬ô\u0087fa.;ì\u0015\u009dðSÊñ¤\u0092\u007f|Y\u00193Ò\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ%¬Ð\u0087fa&;ý\u0015\u009dð_Êì¤¾\u007f\\Y\u000e3Ö\u000etè%Âû\u009c\u0099ú^ ;Nít\u009d\u0093F¹æç´\u0002g(\u0015Vç}u\u009b=Áÿï\u008e\n@0â^\u0091\u0085a£\fÉÐôr\u00120\u0000MÚ,´â\u008e¦iPC×\u001d§ø~Ò\u001f¬ô\u0087fa.;ì\u0015\u009dðSÊñ=\u001aç{\u0089µ³ùT\r~¢ üÅ>ïL\u0091\u0096º<\\l\u0006¢(ßÍ\r÷\u0095\u0099ãB+dM\u000e\u009436Õt\u0000MÚ,´â\u008eµiQCö\u001d¯øiÒ\f¬Ð\u0087fa\u000e;ø\u0015\u0088ðFÊ÷¤µ\u007foÏ·\u0015Ö{\u0018AN¦§\u008c\u001cÒZ7\u0080\u001dþc\u001fH\u008a®Úô\u0010Úz?¨\u0005\u001ckX\u0000MÚ,´â\u008e¦iPCà\u001d¾øoÒ\r¬Ç\u0087Ra.;î\u0015\u0088ð[Êæ¤¤\u007fxY\u00183ÄE\u001c\u009f}ñ³Ë÷,\u0001\u0006±Xï½>\u0097\\é\u0096Â\u0001${~¾PÈµ\b\u008f¼áò:)\u001ckv\u0087K'\u00ada\u0087¢Ùß2\u001d\u0014±nñC=Q\u001a\u008b{åµßñ8\u0007\u0012·Lé©8\u0083Zý\u0090Ö\u00060qj¬DÐ¡\u0000\u009b¸õÄ.%\bQb\u008c_6¹e\u0093½ÍÕ&\u0000\u0000¼zÕW)±Ië\u008fÄ<>a\u0018\u0083rß¯\u001f\u0089£Á\u0087\u001bæu(Ol¨\u009a\u0082*Üt9¥\u0013Çm\rF\u0081 ëú?ÔW1\u0095\u000b(ev¾¾\u0098Úò\u001cÏº)ò\u0003;]O¶¢\u0090.êjÇ´!Ë{\u0016T¸®ü\u0088\u0018âTK\u001d\u0091|ÿ²Åö\"\u0000\b°Vî³?\u0099]ç\u0097Ì\u001e*vp¿^Í»\u0003\u0081½ïå4?õ|/\u001dAÓ{\u0097\u009ca¶æè\u0096\rO'.YÅrW\u0094\u001fÎÝà¬\u0005b?ÀQ\u00ad\u008aE¬(ÆòûP\u001d\u000e7Êi¨\u0000MÚ,´â\u008e®iZCõ\u001d«øiÒ\u001b¬Á\u0087ka;;õ\u0015\u0088ðZÊÂ¤´\u007f|Y\u001a3Ã\u000eaè#ÂÒ\u009c\u0082wKQñ+·\u0006qà\tºË\u0000MÚ,´â\u008eµiQCö\u001d¯øiÒ\f¬Ð\u0087fa\u000e;ø\u0015\u0088ðFÊ÷¤µ\u007foY&3Þ\u000ewè%Âû\u009c\u0085w]Q÷\u0000MÚ,´â\u008e´i]Cæ\u001d øzÒ\u0004¬ö\u0087ma#;ð\u0015\u008cðUÊ÷¤¹\u007frY\u00043û\u000emè\"Âê\u009c\u008ewVQà+ \u0000MÚ,´â\u008e¢iFCó\u001d¡øi\u009bYA%/ò\u0015³òCØï\u0086¿cmI27ß\u001cuú6 à\u008e\u0092kOQè?¼äHÂ\u0013¨Á\u0095}s.Yã\u0007\u0081\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ*¬Ç\u0087ma.;ø\u0015\u008aðWÊð¤¤\u007fPY\u000b3Ù\u000eeè6Âû\u009c\u0099wjQà+±\u0006zà\u0005ºÏ\u0095co!e]¿!Ñöë·\fG&ëx»\u009di·7ÉÆâs\u0004>^õp\u009b\u0095C¯üÁ\u00ad\u001au<\u0019VÙkU\u008d(§ñù\u0084\u0012E4þN«\u0000CÚ\"´÷\u008e\u008aiACï\u001d§øxÒ\t¬Á\u0087ma=;Ñ\u0015\u008cðEÊð¤±\u007fzY\u000f3þ\u000eiè!Âò\u0087\u0007]{3¬\tíî\u001dÄ±\u009aá\u007f3Um+\u009c\u0000)æd¼¯\u0092Áw\u0019M¦#÷ø/ÞC´\u0083\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ+¬Ú\u0087oa\";é\u0015\u0087ð_Êà¤±\u007fiY\u00053Å\u000eWè$Âü\u009c\u0098w[Q÷+»\u0006}à\tºË@\u009a\u009aæô1Îp)\u0080\u0003,]|¸®\u0092ðì\u0001Ç´!ù{2U\\°\u0084\u008a;äj?²\u0019Þs\u001eN\u008f¨ÿ\u0082'Ü\\7\u008a\u0011-kaF¡ Åk\u0019±eß²åó\u0002\u0003(¯vÿ\u0093-¹sÇ\u0082ì7\nzP±~ß\u009b\u0007¡¸Ïé\u001412]X\u009de\u0011\u0083l©µ÷À\u001c\u0001:º@ãm)\u008bSÑ²þ;\u0004y\"\u008eHÜ\u0095\u0001³º\u008a_P#>ô\u0004µãEÉé\u0097¹rkX5&Ä\rqë<±÷\u009f\u0099zA@þ.¯õwÓ\u001b¹Û\u0084_b!Hô\u0016\u009cýRÛâ\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ.¬À\u0087na#;ï\u0015\u008aðDÊæ¤µ\u007fsY>3ß\u000eaè<Âû\u009c\u008fwyQæ+¦\u0006và\u001aºÐ\u0095ro*\u0000cÚ\"´÷\u008eÉiUCñ\u001d¾øwÒ\u0007¬Ã\u0087ka!;²\u0015\u0088ðRÊõ¤¹\u007fxY\u001d3\u0099\u000eEè!Âî\u009c§wWQó+»\u0006qà*ºÌ\u0095jo?IÓ#\u008eþHØâ²±\u008dOg:AÓ\u001cmö8ÐÇª\u008b\u0085}_ê9¢\u0014Jî\u0006ÈÔ£~}.\u0000MÚ,´â\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087f\u0000MÚ,´â\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\u0003;õ\u0015\u009aðBÊæ¤¾\u007fxY\u0018\u0000MÚ,´â\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\u0003;ó\u0015\u0088ðRÊæ¤¢\u0000MÚ,´â\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\u0006;ñ\u0015\u0099ðZ\u0000MÚ,´â\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\u0019;õ\u0015\u008cðA\u0000cÚ\"´÷\u008eÉiUCñ\u001d¾øwÒ\u0007¬Ã\u0087ka!;²\u0015\u0084ðSÊç¤¹\u007f|Y\u001e3Þ\u000ekè?Â°\u009c\u0085wYQñ+»\u0006ià\tºø\u0095bo I\u008e# þ[Øÿ²\u009a\u008d@g\u001aAÒ\u001c~ö0Ðãª\u008b\u0085j_à9³\u0014TI\u0016\u0093wý¹Çò \u000e\n®Tü±6\u009bVå¯Î=(Br®\\×¹\u001a\u0083\u009aíâ6(\u0010Uz\u0089G-\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ&¬Ô\u0087va&;ê\u0015\u008cðwÊç\u001f\u0084Åø«/\u0091nv\u009e\\2\u0002bç°Íã³\u0011\u0098³~ã$/\nIï²Õ\"»P`®FÊ,\u001c\u0011µ÷ØÝ2\u0083]h\u0089N%4y\u0019¿ÿÛ\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ&¬Ô\u0087va&;ê\u0015\u008cðwÊç¤\u0083\u007fxY\u00183Á\u000emè2Âû\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ%¬Ð\u0087fa&;ý\u0015¿ð_Êæ¤§\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ>¬Ô\u0087qa;;Ñ\u0015\u008cðRÊê¤±\u007fKY\u00033Ò\u000es$¥þÙ\u0090\u000eªOM¿g\u00139CÜ\u0091öÂ\u00880£\u0092EÂ\u001f\u000e1hÔ\u0093î\u0003\u0080}[\u0094}þ\u0017?\u0000VÚ\b´È\u008e´i}CÎ\u001d\u0080\u0000^Ú\u0011´þ\u008e¼ihCå\u001dàøFÒC¬é\u0087fak\u0000sÚ(´î\u008e¦iPCÂ\u001d¢ørÒ\u000b¬Þ\u0087Na&;ï\u0015\u009dðSÊí¤µ\u007fo{\u0093¡ÈÏ\u000eõF\u0012°87fG\u0083\u009f©í×:ü²\u001aÃ@\u001dnp\u008b´±\u0002ßS\u0004\u0096\"ÆH>u\u0097\u0093Å¹\u001bçe\f½*\u0017\u0000sÚ(´î\u008e¦iPCÅ\u001d§øhÒ\u0018¬Ù\u0087ca6;Ð\u0015\u0080ðEÊ÷¤µ\u007fsY\u000f3ÅÞ5\u0004zj¼Pô·\u0002\u009d\u0085Ãõ&,\fMr¤Y?¿såºËÉ.\u000b\u0014½zî¡*\u0087Jò\u0095(ÚF\u001c|T\u009b¢±:ïX\n§ ï^*u\u0092\u0093ØÉ\u001c\u0000gÚ(´î\u008e´i]Cû\u001d«\u0000gÚ(´î\u008e³iMCñ\u001d«\u0000gÚ(´î\u008e½i[Cï\u001d«øRÒ\f\u0013ÃÉ\u008c§J\u009d\u0000zâP@\u000e\u000bëËÁ¥¿g\u0094Ãr¢(\\\u0000iÚ>´Ì\u008e\u008eiPCä\u001d¡øZÒ\f\u0000iÚ>´Ø\u008e\u0086iZCï\u001d«øi\u0000iÚ>´Ó\u008e\u0089iWCä\u001d øoÒ\u0001¬Ã\u0087ka5;ù\u0015\u008dðwÊç\u0000gÚ(´î\u008e¦iDCñ\u001d\u0082øtÒ\u001e¬Ü\u0087la\r;î\u0015\u0086ðWÊç¤³\u007f|Y\u00193Ã\u000eIè0Âð\u009c\u008aw_Qà+ 9\u000bãQ\u008d\u0084·÷P>z\u008c$ÒÁ\u0010ëP\u0095¼¾\u000bXz\u0002\u008a,æÉ&ó\u0094\u009dëF\u0016`|\n¯7\u0019ÑKû\u0086¥áN5h®\u0012Î?\u0005Ùp\u0083©¬\tVOp«\u0000uÚ#´è\u008e\u0082iSCè\u001d½øoÒ\r¬Ç\u0087Ca?;ì\u0015¥ðYÊõ¤¹\u007fsY(3Å\u000ekè0Âú\u009c\u0088wYQö+¦\u0006Mà\tºÚ\u0095co:IÖ#\u0088þHuS¯\u001cÁÚû\u0092\u001cp6Åh¶\u008d@§*ÙèòX\u00148NÇ`°\u0085o¿ÂÑ\u008a\n@,=Fâ{D\u009d\n·Øé\u0092\u0002i$Â^\u0095sJ\u0095?Ïèàv\u001a\u0006<àV¸\u0000sÚ8´ø\u008e\u0094iWCó\u001d§øyÒ\r¬á\u0087ma\u000e;ì\u0015\u0099ðzÊì¤¦\u007ftY\u00043ô\u000ekè<Âó\u009c\u009ewVQì+±\u0006~à\u0018ºÖ\u0095t\u0000gÚ(´î\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\u0002;ý\u0015\u0080ðXÊÊ¤½\u007f|Y\r3Ò\u000eQè#Â÷\u0000sÚ(´î\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\n;ê\u0015\u008cðXÊ÷¤\u009c\u007ftY\u00193Ã\u000eaè?Âû\u009c\u0099:\ràB\u008e\u0084´ÃS?y\u009f'ÍÂ\u0007èg\u0096\u009e½\f[l\u0001\u0095/ìÊ2ð¼\u009eÈE\u001e".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2053);
        f822 = cArr;
        f823 = -1288543479881606579L;
    }

    public bi(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static boolean m4900(AppLovinAd appLovinAd) {
        int i10 = f820 + 119;
        f821 = i10 % 128;
        int i11 = i10 % 2;
        boolean zIsVideoAd = appLovinAd.isVideoAd();
        int i12 = f820 + 59;
        f821 = i12 % 128;
        int i13 = i12 % 2;
        return zIsVideoAd;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean m4901(AppLovinAd appLovinAd) {
        int i10 = f820 + 75;
        f821 = i10 % 128;
        int i11 = i10 % 2;
        if ((appLovinAd != null ? 'a' : 'E') == 'a') {
            if (appLovinAd.getType().equals(AppLovinAdType.INCENTIVIZED)) {
                int i12 = f820 + 13;
                f821 = i12 % 128;
                int i13 = i12 % 2;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static boolean m4902(AppLovinAd appLovinAd) {
        if (!(appLovinAd == null)) {
            int i10 = f820 + 35;
            f821 = i10 % 128;
            if (i10 % 2 != 0) {
                m4906(appLovinAd);
                int i11 = AppLovinAdSize.SPAN;
                throw null;
            }
            if (!(m4906(appLovinAd) != AppLovinAdSize.BANNER) || m4906(appLovinAd) == AppLovinAdSize.LEADER || m4906(appLovinAd) == AppLovinAdSize.MREC) {
                int i12 = f821 + 93;
                f820 = i12 % 128;
                if (i12 % 2 != 0) {
                    return true;
                }
                throw null;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m4903(AppLovinAd appLovinAd) {
        int i10 = f821 + 73;
        f820 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM4901 = m4901(appLovinAd);
        int i12 = f821 + 23;
        f820 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return zM4901;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static AppLovinAdType m4904(AppLovinAd appLovinAd) {
        int i10 = f820 + 7;
        f821 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        AppLovinAdType type = appLovinAd.getType();
        if (!z10) {
            int i11 = 66 / 0;
        }
        int i12 = f820 + 27;
        f821 = i12 % 128;
        int i13 = i12 % 2;
        return type;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long m4905(AppLovinAd appLovinAd) {
        long adIdNumber;
        int i10 = f820 + 91;
        f821 = i10 % 128;
        if ((i10 % 2 != 0 ? '1' : '6') != '1') {
            adIdNumber = appLovinAd.getAdIdNumber();
        } else {
            adIdNumber = appLovinAd.getAdIdNumber();
            int i11 = 49 / 0;
        }
        int i12 = f820 + 51;
        f821 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return adIdNumber;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static AppLovinAdSize m4906(AppLovinAd appLovinAd) {
        int i10 = f821 + 5;
        f820 = i10 % 128;
        int i11 = i10 % 2;
        AppLovinAdSize size = appLovinAd.getSize();
        int i12 = f821 + 3;
        f820 = i12 % 128;
        int i13 = i12 % 2;
        return size;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static String m4907(AppLovinAd appLovinAd) {
        int i10 = f821 + 103;
        f820 = i10 % 128;
        int i11 = i10 % 2;
        String zoneId = appLovinAd.getZoneId();
        int i12 = f821 + 29;
        f820 = i12 % 128;
        int i13 = i12 % 2;
        return zoneId;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AppLovinBroadcastManager m4908(Context context) {
        int i10 = f821 + 101;
        f820 = i10 % 128;
        int i11 = i10 % 2;
        AppLovinBroadcastManager appLovinBroadcastManagerM4917 = m4917(context);
        int i12 = f821 + 37;
        f820 = i12 % 128;
        if (i12 % 2 != 0) {
            return appLovinBroadcastManagerM4917;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AppLovinAdSize m4909(AppLovinAd appLovinAd) {
        int i10 = f821 + 31;
        f820 = i10 % 128;
        if ((i10 % 2 == 0 ? 'T' : (char) 31) != 'T') {
            return m4906(appLovinAd);
        }
        m4906(appLovinAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4910(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f822[i10 + i12]) ^ (((long) i12) * f823)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m4911(Context context, final String str, String str2) {
        AppLovinCommunicator.getInstance(context).subscribe(new AppLovinCommunicatorSubscriber() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.14
            @Override // com.applovin.communicator.AppLovinCommunicatorEntity
            public final String getCommunicatorId() {
                return str;
            }

            @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
            public final void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
            }
        }, str2);
        int i10 = f821 + 53;
        f820 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 16 : '`') != '`') {
            int i11 = 90 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m4912(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        int i10 = f821 + 7;
        f820 = i10 % 128;
        int i11 = i10 % 2;
        appLovinInterstitialAdDialog.setAdClickListener(appLovinAdClickListener);
        int i12 = f821 + 117;
        f820 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m4913(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        int i10 = f821 + 9;
        f820 = i10 % 128;
        int i11 = i10 % 2;
        a0.a();
        int i12 = f821 + 91;
        f820 = i12 % 128;
        if (!(i12 % 2 == 0)) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m4914(bi biVar, Context context, String str, String str2) {
        int i10 = f821 + 89;
        f820 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        biVar.m4911(context, str, str2);
        if (!z10) {
            throw null;
        }
        int i11 = f821 + 35;
        f820 = i11 % 128;
        if ((i11 % 2 == 0 ? '^' : ';') == ';') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m4915(bi biVar, AppLovinAd appLovinAd) {
        int i10 = f820 + 13;
        f821 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            m4902(appLovinAd);
            throw null;
        }
        boolean zM4902 = m4902(appLovinAd);
        int i11 = f820 + 65;
        f821 = i11 % 128;
        int i12 = i11 % 2;
        return zM4902;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Uri m4916(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i10 = f820 + 97;
        f821 = i10 % 128;
        int i11 = i10 % 2;
        Uri uriM4928 = m4928(appLovinNativeAdImpl);
        int i12 = f820 + 73;
        f821 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 5 : '1') == '1') {
            return uriM4928;
        }
        int i13 = 50 / 0;
        return uriM4928;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static AppLovinBroadcastManager m4917(Context context) {
        int i10 = f820 + 121;
        f821 = i10 % 128;
        int i11 = i10 % 2;
        AppLovinBroadcastManager appLovinBroadcastManager = AppLovinBroadcastManager.getInstance(context);
        int i12 = f821 + 67;
        f820 = i12 % 128;
        int i13 = i12 % 2;
        return appLovinBroadcastManager;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m4918(MaxAd maxAd) {
        int i10 = f820 + 15;
        f821 = i10 % 128;
        int i11 = i10 % 2;
        String creativeId = maxAd.getCreativeId();
        int i12 = f821 + 39;
        f820 = i12 % 128;
        int i13 = i12 % 2;
        return creativeId;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m4919(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        int i10 = f821 + 121;
        f820 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m4932(adViewController, appLovinAdDisplayListener);
        if (!z10) {
            int i11 = 50 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m4920(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i10 = f820 + 59;
        f821 = i10 % 128;
        int i11 = i10 % 2;
        appLovinInterstitialAdDialog.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
        int i12 = f821 + 117;
        f820 = i12 % 128;
        if ((i12 % 2 == 0 ? '%' : (char) 24) != 24) {
            int i13 = 29 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m4921(AppLovinAd appLovinAd) {
        int i10 = f820 + 35;
        f821 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            m4900(appLovinAd);
            throw null;
        }
        boolean zM4900 = m4900(appLovinAd);
        int i11 = f820 + 83;
        f821 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 5 : 'A') == 'A') {
            return zM4900;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Uri m4922(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i10 = f821 + 13;
        f820 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 11 : 'H';
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        if (c10 != 'H') {
            int i11 = 37 / 0;
        }
        int i12 = f821 + 19;
        f820 = i12 % 128;
        if ((i12 % 2 == 0 ? '>' : 'S') == 'S') {
            return mainImageUri;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ AdViewController m4923(AppLovinAdView appLovinAdView) {
        int i10 = f821 + 9;
        f820 = i10 % 128;
        if ((i10 % 2 == 0 ? '.' : 'F') == '.') {
            m4938(appLovinAdView);
            throw null;
        }
        AdViewController adViewControllerM4938 = m4938(appLovinAdView);
        int i11 = f820 + 13;
        f821 = i11 % 128;
        int i12 = i11 % 2;
        return adViewControllerM4938;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m4924(AppLovinAd appLovinAd) {
        int i10 = f820 + 7;
        f821 = i10 % 128;
        if ((i10 % 2 != 0 ? G5.T : 'U') == 'U') {
            return m4907(appLovinAd);
        }
        m4907(appLovinAd);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m4925(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i10 = f821 + 31;
        f820 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '&' : (char) 0;
        m4920(appLovinInterstitialAdDialog, appLovinAdVideoPlaybackListener);
        if (c10 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m4926(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        int i10 = f820 + 51;
        f821 = i10 % 128;
        int i11 = i10 % 2;
        a0.a();
        int i12 = f820 + 27;
        f821 = i12 % 128;
        if ((i12 % 2 != 0 ? '\\' : 'G') != '\\') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m4927(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        int i10 = f820 + 83;
        f821 = i10 % 128;
        int i11 = i10 % 2;
        appLovinNativeAdImpl.setEventListener(appLovinNativeAdEventListener);
        int i12 = f820 + 31;
        f821 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Uri m4928(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i10 = f820 + 33;
        f821 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            appLovinNativeAdImpl.getIconUri();
            throw null;
        }
        Uri iconUri = appLovinNativeAdImpl.getIconUri();
        int i11 = f821 + 125;
        f820 = i11 % 128;
        if (!(i11 % 2 == 0)) {
            return iconUri;
        }
        int i12 = 56 / 0;
        return iconUri;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Bundle m4929(CommunicatorMessageImpl communicatorMessageImpl) {
        int i10 = f820 + 117;
        f821 = i10 % 128;
        int i11 = i10 % 2;
        Bundle messageData = communicatorMessageImpl.getMessageData();
        int i12 = f821 + 49;
        f820 = i12 % 128;
        int i13 = i12 % 2;
        return messageData;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ AppLovinAdType m4930(AppLovinAd appLovinAd) {
        int i10 = f820 + 103;
        f821 = i10 % 128;
        if ((i10 % 2 != 0 ? '7' : '`') == '`') {
            return m4904(appLovinAd);
        }
        m4904(appLovinAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m4931(MaxAd maxAd) {
        int i10 = f820 + 17;
        f821 = i10 % 128;
        int i11 = i10 % 2;
        String strM4918 = m4918(maxAd);
        int i12 = f821 + 61;
        f820 = i12 % 128;
        int i13 = i12 % 2;
        return strM4918;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m4932(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        int i10 = f821 + 69;
        f820 = i10 % 128;
        int i11 = i10 % 2;
        adViewController.setAdDisplayListener(appLovinAdDisplayListener);
        int i12 = f820 + 87;
        f821 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m4933(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        int i10 = f821 + 113;
        f820 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 2 : (char) 16;
        m4912(appLovinInterstitialAdDialog, appLovinAdClickListener);
        if (c10 != 2) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m4934(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        int i10 = f820 + 29;
        f821 = i10 % 128;
        int i11 = i10 % 2;
        m4926(appLovinBroadcastManager, receiver, intentFilter);
        int i12 = f821 + 113;
        f820 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ long m4935(AppLovinAd appLovinAd) {
        int i10 = f820 + 77;
        f821 = i10 % 128;
        int i11 = i10 % 2;
        long jM4905 = m4905(appLovinAd);
        int i12 = f820 + 75;
        f821 = i12 % 128;
        if ((i12 % 2 != 0 ? '4' : '>') == '>') {
            return jM4905;
        }
        int i13 = 44 / 0;
        return jM4905;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Uri m4936(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i10 = f820 + 45;
        f821 = i10 % 128;
        int i11 = i10 % 2;
        Uri uriM4922 = m4922(appLovinNativeAdImpl);
        int i12 = f821 + 99;
        f820 = i12 % 128;
        int i13 = i12 % 2;
        return uriM4922;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Bundle m4937(CommunicatorMessageImpl communicatorMessageImpl) {
        int i10 = f821 + 55;
        f820 = i10 % 128;
        int i11 = i10 % 2;
        Bundle bundleM4929 = m4929(communicatorMessageImpl);
        int i12 = f821 + 37;
        f820 = i12 % 128;
        if (i12 % 2 != 0) {
            return bundleM4929;
        }
        int i13 = 31 / 0;
        return bundleM4929;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static AdViewController m4938(AppLovinAdView appLovinAdView) {
        int i10 = f821 + 51;
        f820 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 26 : (char) 22;
        AdViewController adViewController = appLovinAdView.getAdViewController();
        if (c10 == 26) {
            int i11 = 27 / 0;
        }
        return adViewController;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m4939(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        int i10 = f821 + 49;
        f820 = i10 % 128;
        int i11 = i10 % 2;
        m4913(appLovinBroadcastManager, receiver);
        int i12 = f821 + 45;
        f820 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m4940(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        int i10 = f820 + 97;
        f821 = i10 % 128;
        int i11 = i10 % 2;
        m4927(appLovinNativeAdImpl, appLovinNativeAdEventListener);
        int i12 = f821 + 89;
        f820 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m4910(1663 - View.resolveSize(0, 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Drawable.resolveOpacity(0, 0) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bi.m4933((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdClickListener) list.get(1));
                return null;
            }
        });
        map.put(m4910(((byte) KeyEvent.getModifierMetaStateMask()) + 1682, (char) (31712 - TextUtils.indexOf("", "", 0, 0)), KeyEvent.keyCodeFromString("") + 26).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bi.m4925((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdVideoPlaybackListener) list.get(1));
                return null;
            }
        });
        map.put(m4910(1707 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 20 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bi.m4919((AdViewController) list.get(0), (AppLovinAdDisplayListener) list.get(1));
                return null;
            }
        });
        map.put(m4910(1727 - View.combineMeasuredStates(0, 0), (char) (56914 - (ViewConfiguration.getPressedStateDuration() >> 16)), 19 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bi.m4923((AppLovinAdView) list.get(0));
            }
        });
        map.put(m4910(1746 - Drawable.resolveOpacity(0, 0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 62194), 13 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return Long.valueOf(bi.m4935((AppLovinAd) list.get(0)));
            }
        });
        map.put(m4910((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1760, (char) TextUtils.getOffsetAfter("", 0), 7 - View.MeasureSpec.getMode(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bi.m4909((AppLovinAd) list.get(0));
            }
        });
        map.put(m4910(1766 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) Color.green(0), View.combineMeasuredStates(0, 0) + 7).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bi.m4930((AppLovinAd) list.get(0));
            }
        });
        map.put(m4910((ViewConfiguration.getPressedStateDuration() >> 16) + 1773, (char) Gravity.getAbsoluteGravity(0, 0), View.MeasureSpec.getMode(0) + 9).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bi.m4924((AppLovinAd) list.get(0));
            }
        });
        map.put(m4910((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1782, (char) (5028 - (ViewConfiguration.getTouchSlop() >> 8)), 13 - View.resolveSize(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.21
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bi.m4931((MaxAd) list.get(0));
            }
        });
        map.put(m4910(1843 - AndroidCharacter.getMirror('0'), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 9 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return Boolean.valueOf(bi.m4921((AppLovinAd) list.get(0)));
            }
        });
        map.put(m4910(1804 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), Color.alpha(0) + 8).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return Boolean.valueOf(bi.m4915(bi.this, (AppLovinAd) list.get(0)));
            }
        });
        map.put(m4910(1812 - Color.blue(0), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 16 - ExpandableListView.getPackedPositionType(0L)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return Boolean.valueOf(bi.m4903((AppLovinAd) list.get(0)));
            }
        });
        map.put(m4910(1828 - TextUtils.indexOf("", "", 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 28).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bi.m4908((Context) list.get(0));
            }
        });
        map.put(m4910((-16775361) - Color.rgb(0, 0, 0), (char) (KeyEvent.keyCodeFromString("") + 14713), KeyEvent.getDeadChar(0, 0) + 33).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bi.m4934((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1), (IntentFilter) list.get(2));
                return null;
            }
        });
        map.put(m4910((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1888, (char) KeyEvent.getDeadChar(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 35).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bi.m4939((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1));
                return null;
            }
        });
        map.put(m4910(TextUtils.lastIndexOf("", '0') + 1924, (char) (30004 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 35).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bi.m4937((AppLovinCommunicatorMessage) list.get(0));
            }
        });
        map.put(m4910(1957 - (KeyEvent.getMaxKeyCode() >> 16), (char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf((CharSequence) "", '0', 0) + 32).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bi.m4914(bi.this, (Context) list.get(0), (String) list.get(1), (String) list.get(2));
                return null;
            }
        });
        map.put(m4910(((Process.getThreadPriority(0) + 20) >> 6) + 1988, (char) ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionChild(0L) + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bi.m4936((AppLovinNativeAdImpl) list.get(0));
            }
        });
        map.put(m4910(2011 - View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getOffsetBefore("", 0) + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bi.m4940((AppLovinNativeAdImpl) list.get(0), (AppLovinNativeAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m4910((ViewConfiguration.getEdgeSlop() >> 16) + 2035, (char) (14953 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 19).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bi.m4916((AppLovinNativeAdImpl) list.get(0));
            }
        });
        int i10 = f820 + 63;
        f821 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        int i10 = f821 + 63;
        f820 = i10 % 128;
        try {
            try {
                String str = (String) ((i10 % 2 == 0 ? '*' : (char) 4) != '*' ? AppLovinSdk.class.getDeclaredField(m4910(TextUtils.lastIndexOf("", '0', 0) + 1645, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.MeasureSpec.getSize(0) + 7).intern()) : AppLovinSdk.class.getDeclaredField(m4910(10499 << TextUtils.lastIndexOf("", 'u', 1), (char) (0 >> (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 66 / View.MeasureSpec.getSize(1)).intern())).get(null);
                int i11 = f820 + 123;
                f821 = i11 % 128;
                int i12 = i11 % 2;
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return hu.m6425().m6427().m6527(AppLovinSdk.class, m4910(TextUtils.getCapsMode("", 0, 0) + 1651, (char) TextUtils.getCapsMode("", 0, 0), Color.green(0) + 12).intern());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0b33 A[PHI: r5
      0x0b33: PHI (r5v6 byte) = (r5v5 byte), (r5v0 byte) binds: [B:253:0x0b31, B:250:0x0b0a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e5  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 3870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bi.mo4814(java.lang.String):java.lang.Class");
    }
}
