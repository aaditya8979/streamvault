package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.hyprmx.android.BuildConfig;
import com.hyprmx.android.sdk.activity.HyprMXBaseViewController;
import com.hyprmx.android.sdk.activity.HyprMXMraidViewController;
import com.hyprmx.android.sdk.activity.HyprMXNoOffersActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferViewerActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferWebViewController;
import com.hyprmx.android.sdk.activity.HyprMXRequiredInformationActivity;
import com.hyprmx.android.sdk.activity.HyprMXVastViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebTrafficViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebView;
import com.hyprmx.android.sdk.activity.HyprMXWebViewClient;
import com.hyprmx.android.sdk.activity.OfferViewerHandler;
import com.hyprmx.android.sdk.api.data.Ad;
import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import com.hyprmx.android.sdk.core.DependencyHolder;
import com.hyprmx.android.sdk.core.HyprMX;
import com.hyprmx.android.sdk.core.HyprMXController;
import com.hyprmx.android.sdk.graphics.HyprMXLearnMoreController;
import com.hyprmx.android.sdk.graphics.HyprMXSkipController;
import com.hyprmx.android.sdk.graphics.HyprMXWebViewWithClosableNavBar;
import com.hyprmx.android.sdk.model.PreloadedVastData;
import com.hyprmx.android.sdk.overlay.HyprMXBrowserActivity;
import com.hyprmx.android.sdk.placement.PlacementController;
import com.hyprmx.android.sdk.placement.PlacementType;
import com.hyprmx.android.sdk.utility.HyprMXProperties;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class bp extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f984 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f985;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f986;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f987;

    static {
        char[] cArr = new char[1080];
        ByteBuffer.wrap("\u0097ýä\u0083q#Í¿ZVÖÅ#k°\u000f\f\u008d\u0099?\u0015¤bA¥iÖ\u0006C\u0089ÿ+hßär\u0011\u0097\u0082\u0091>t«¾'\u0011P¼\u0000Hs\u0014æªZ5ÍùAy\u0000Hs\u0014æªZ5ÍùAy´Í'\u0094\u009b\u0006\u000e¡\u00820õÀipÜåO\u0093Ã\u0011\u0000Ps\u0001æ»Z$ÍÑAL´ë'\u0095\u009b\u001c\u000e\u0081\u0082;õßiy\u0000As\t\u0000Ds\bæªZ\"ÍÚAE´ë'\u0095\u009b\u000b\u000e¬\u0082\nõÀipÜíO\u0093Ã\u0011à§\u0093è\u0006HºÜ-,¡·T\u001dÇi{ûîtbÔ\u0015+\u0089\u009f<:¯`#àÖF\u0000Hs\u0014æªZ5ÍùAy´Þ'\u0089\u009b\u0007\u000e¥\u0082'õÝihÜàO\u0093Ã\u0010\u0005\u001dvAãÿ_`È¬D,±\u008c\"Ë\u009e_\u000bÖ\u0087~ð\u009fl>Ù\u008bJÊÆB3í¯+\u0018\u0093\u0094-\u0001¢rÅîi[ò×\b@¾¼&)\\\u009aû\u0016m\u0083á;lH\rÝ¸aföÓzW\u008fñ\u001c\u0086 \n5¢¹cÎÁR}çât\u008bø\u0003\r¶\u0091V&\u008bªk?ïL\u0095Ð\u007fe£éE~Ë\u0082m\u0017\u0018¤\u008a(5½ºÁ\u0012VçÚ{o\u0005ü\u009a\u0000\u0016\u0095\u0096\u0019v®ñ2eG,Ô\u0084X%íÄqq\u0086ð\nx\u009f\u0017,\u0091°)Å×IXÞÿc\u0093÷\b\u0004²\u0088\u0004\u001dÜ¡f6Á»\u0097Ï\u001b\u0000Hs\u0014æªZ5ÍùAy´À'\u0094\u009b'\u000e³\u0082$õÊinÜúO·Ã\u00006¤ªT\u001dÜ\u0091~\u0004ðw\u0088\u0000cs\u0002æ·ZiÍÜAX´þ'\u0089\u009b\u0005\u000e\u00ad\u0082lõÎirÜíO\u0084Ã\f6¹ªY\u001d\u0084\u0091d\u0004àw\u009aëp^ªÒ[EÑ¹{,\t\u009f\u0085\u0013-\u0086¿ú\u001dmèátT\nÇ\u0095;\u0019®\u0099\"`\u0095ô\tG|\u0013ï\u0084c*ÖÎJZ½×1`¤\u0004\u0017´\u008b<þÞrPåè\u0000Hs\u0014æªZ5ÍùAy´Á'\u009d\u009b\u000e\u000e°\u00820õùiuÜìO\u0081Ã\u00066¢ª|\u001dÉ\u0091c\u0004íw\u0087ë7^¿ÒA]'.F»ó\u0007-\u0090\u0098\u001c\u001céºzÍÆASéß(¨\u008a46\u0081©\u0012À\u009eHký÷\u001d@ÀÌ Y¤*Þ¶4\u0003î\u008f\u001f\u0018\u0095ä?qMÂÁNiÛû§Y0¬¼0\tN\u009aÑf]óÝ\u007f%È¹T*!T²Ô>]\u008b\u0091\u0017\bà¥l\"ùFJØÖm£\u0087/\t¸£\u0005Ó\u0091[bå\u0000Hs\u0014æªZ5ÍùAy´Ü'\u009e\u009b\u0019\u000e \u0082+õÝiyÜíO¿Ã\r6¶ªR\u001dØ\u0091z\u0004åw\u0085ë7^¤ÒVEä¹q,\u000b\u009f\u0085\u0013/\u0086¯úGmÙ¶¶Å×Pbì¼{\t÷\u008d\u0002+\u0091\\-Ð¸x4¹C\u001bß§j8ùQuÙ\u0080l\u001c\u008c«Q'±²5ÁO]¥è\u007fd\u008eó\u0004\u000f®\u009aÜ)P¥ø0jLÈÛ=W¡âßq@\u008dÌ\u0018L\u0094©#+¿¬ÊÕY^Õè`\fü\u0098\u000b\n\u0087¸\u0012Ã¡g=íH\u000fÄ\u0090S0îBzÑ\u0089c\u0005Ñ\u0090\u0004,¾»06ZBÚÑrmìÜ\u0082¯Þ:`\u0086ÿ\u00113\u009d³h\u0006ûPGÑÒz^Þ)\fµ³\u00004\u0093\u007f\u001fÆêtv\u0083Á\u0012M²Ø\"«W7ñ\u0082s3\u0015@IÕ÷ihþ¤r$\u0087\u0085\u0014Ç¨F=ü±IÆ\u009bZ$ï£|èðQ\u0005ã\u0099\u0014.\u0085¢%7µDÀØfmä\u0000Hs\u0014æªZ5ÍùAy´Ù'\u009e\u009b\n\u000e\u0081\u00820õÎizÜïO\u009fÃ\u00006\u0086ªT\u001dÏ\u0091`\u0004Çw\u009eë0^¿ÒJEÊ¹~,\u0013\u009f\u0089\u0013+\u0000Os\u000bæ¼Z\"ÍÆAb´ï'\u0098\u009b\u0000\u000e°\u0082\u0007õÁihÜàO\u0082Ã\u001a\u0018\tkVþæBMÕ\u0098Y\u001e¬¶?Ã\u0083_\u0016è\u009aSí\u0093q(Ä²WËÛIL\u008d?Òªb\u0016É\u0081\u001c\r\u009aø2kG×ÛBlÎÍ¹'%\u008aÜ\u0096¯Ê:t\u0086ë\u0011'\u009d§h\u001cû@G×Òy^ò)<µ\u00ad\u0000%\u0093M\u001fþêav\u008dÁ\u0000M»Ø5«C7ì\u0082p\u000e\u0094Va%=°\u0083\f\u001c\u009bÐ\u0017Pâêq Í X\u0095Ô\u000f£Ð?\\\u008aÅ\u0019¨\u0095\t`\u0096üzK÷ÇLRÂ!´½\u001b\b\u0087\u0084cS÷ «µ\u0015\t\u008a\u009eF\u0012Æç~t\"È±]\u000fÑ\u008f¦G:Æ\u008fT\u001c\u001f\u0090µe\nùõNVÂÇWU$:¸\u0093\r\u001b\u0081ë\u0016vêÈ\u007f²ïà\u009c¼\t\u0002µ\u009d\"Q®Ñ[qÈ6t¢á+m\u0083\u001ab\u0086Ã%\fVPÃî\u007fqè½d=\u0091\u009d\u0002Ú¾N+Ç§oÐ\u008eL/ù\u008ejÞæN\u0013ñ\u008f\u00178\u009a5\u008fFÓÓmoòø>t¾\u0081\u0006\u0012Z®É;w·÷À>\\²é+zFöÁ\u0003e\u009f²(\f¤¾1'BZÞük~Ü\u009b¯ß:h\u0086ö\u0011\u0012\u009d£h3ûJGËÒd^ä)3µ©\u00003\u0093F\u001fÛêav\u009bÁ2MªØ#«Q7ï\u0082q\u000e\u0089\u0099\u0003Ù\u001dªA?ÿ\u0083`\u0014¬\u0098,m\u0088þÅBT×ð[T,\u0095°'\u0005¨\u0096Ñ\u001aYïés\u0004Ä\u009aH0\u008e¶ýêhTÔËC\u0007Ï\u0087:#©n\u0015ÿ\u0080[\fÿ{>ç\u008cR\u0003ÁzMò¸B$¯\u00931\u001f\u009b\u008a6ùfeÓÐA\\£Ë57\u0089¢ó_j,6¹\u0088\u0005\u0017\u0092Û\u001e[ëîx«Ä%Q\u0080Ý\u0013ªè6L\u0083ê\u0010·\u009c5i\u009bõiBáÎA[ß\u0000cs\u0002æ·ZiÍÜAX´þ'\u0089\u009b\u0005\u000e\u00ad\u0082lõÎirÜíO\u0084Ã\f6¹ªY\u001d\u0084\u0091d\u0004àw\u009aëp^¤ÒNEÀ¹`,\u0013\u009f\u008d\u0013 \u0086èú{mÙá}T\bÇª;\f®\u0083\"\\\u0095ô\t\u007f|\u0006ï\u0087c=ÖýJJ½â1j¤\u0006\u0017´\u008b>þÎÞË\u00ad¤8\u0002\u0084¼\u0013}\u009fïjvù%E¥Ð\u001f\\\u0088+j·Ó\u0002j\u00918\u001d¥è\u0019tòÃrOîÚZ©15\u0081Bp1\u001f¤¹\u0018\u001f\u008fÅ\u0003Pöüe\u009eÙ<L£À6·Ð+n\u009eÝ\r\u008d\u0081\u001dt¤èA_éÓhFá5\u0089©<\u001c»\u0090G\u0007çûwn\u0004õ\u0013\u0086|\u0013Ú¯r8¤´\u0001A\u0083Òÿny\u0000gs\bæ®Z\u0017ÍØA@´í'\u009e\u009b\u0005\u000e°\u0082,õÛiHÜðO\u0086Ã\u00066\u0095ªS\u001dß\u0091z\u0000gs\bæ®Z\u0003ÍÑAQ´ë'\u0095\u009b\f\u000e°\u0082,õÌieÜÁO\u0099Ã\u000f6´ªX\u001dØ\u0091^\u0004êw\u0082ë*^ªÒVEÆ¹w\u0000gs\bæ®Z\u0003ÍÝAR´ú'\u0089\u009b\u0001\u000e·\u00827õÛisÜûO¿Ã\u0007áÙ\u0092¶\u0007\u0010»©,f þUSÆ z»ï\u000ec\u0092\u0014e\u0088á=X®&\"©×\u001cKìüxpÅå_\u0096=ãT\u0090;\u0005\u009d¹$.õ¢wWÑÄ§x:í\u0082a\u0014\u0016ø\u008ak?Û¬± 1\u0000gs\bæ®Z\u0017ÍÕAS´ï'\u0096\u009b\r\u000e¡\u0082'õÝio\u0000Rs(æ\u008dZ\u0006ÍæAe´Ë'¿\u008b\u009eøômYÑÕF1Ê¥?\r¬e\u0010ë\u0085K\tÔ~4\u0000Is#æ\u008cZ\u0006ÍøAh´Ê\u0000Ns\"æ\u008eZ\u0018ÍýAo´Ç'¯\u009b!\u000e\u0094\u0082\u000eõæiFÜÌO²".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1080);
        f987 = cArr;
        f986 = 2198696679238169453L;
    }

    public bp(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static DependencyHolder m5122() {
        int i10 = f984 + 33;
        f985 = i10 % 128;
        int i11 = i10 % 2;
        DependencyHolder dependencyHolder = DependencyHolder.INSTANCE;
        int i12 = f985 + 81;
        f984 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return dependencyHolder;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Object m5123(String str) {
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1617199657:
                if (str.equals(m5135(1058 - ExpandableListView.getPackedPositionGroup(0L), (char) (AndroidCharacter.getMirror('0') - '0'), TextUtils.lastIndexOf("", '0') + 8).intern())) {
                    b10 = 2;
                }
                break;
            case -1372958932:
                if (!(str.equals(m5135(ExpandableListView.getPackedPositionType(0L) + 1046, (char) (TextUtils.getCapsMode("", 0, 0) + 35799), TextUtils.indexOf((CharSequence) "", '0', 0) + 13).intern()) ? false : true)) {
                    b10 = 1;
                }
                break;
            case -65580248:
                if (str.equals(m5135((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1064, (char) ((-1) - TextUtils.lastIndexOf("", '0')), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15).intern())) {
                    b10 = 3;
                }
                break;
            case 543046670:
                if (!(!str.equals(m5135(TextUtils.indexOf((CharSequence) "", '0', 0) + IronSourceError.ERROR_IS_SHOW_EXCEPTION, (char) (ImageFormat.getBitsPerPixel(0) + 1), 8 - TextUtils.getTrimmedLength("")).intern()))) {
                    int i10 = f985 + 31;
                    f984 = i10 % 128;
                    int i11 = i10 % 2;
                    b10 = 0;
                }
                break;
        }
        if (b10 == 0) {
            return PlacementType.REWARDED;
        }
        if (b10 == 1) {
            return PlacementType.INTERSTITIAL;
        }
        if (b10 == 2) {
            return PlacementType.INVALID;
        }
        if (b10 == 3) {
            return PlacementType.NOT_INITIALIZED;
        }
        int i12 = f984 + 53;
        f985 = i12 % 128;
        if ((i12 % 2 != 0 ? 'A' : 'T') == 'T') {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ DependencyHolder m5124() {
        int i10 = f984 + 75;
        f985 = i10 % 128;
        int i11 = i10 % 2;
        DependencyHolder dependencyHolderM5122 = m5122();
        int i12 = f985 + 77;
        f984 = i12 % 128;
        int i13 = i12 % 2;
        return dependencyHolderM5122;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ PreloadedVastData m5125(DependencyHolder dependencyHolder) {
        int i10 = f984 + 99;
        f985 = i10 % 128;
        int i11 = i10 % 2;
        PreloadedVastData preloadedVastDataM5128 = m5128(dependencyHolder);
        int i12 = f985 + 3;
        f984 = i12 % 128;
        int i13 = i12 % 2;
        return preloadedVastDataM5128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m5126(Ad ad2) {
        int i10 = f985 + 37;
        f984 = i10 % 128;
        int i11 = i10 % 2;
        String strM5130 = m5130(ad2);
        int i12 = f985 + 89;
        f984 = i12 % 128;
        if (i12 % 2 != 0) {
            return strM5130;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m5127(OfferCacheEntity offerCacheEntity) {
        int i10 = f984 + 71;
        f985 = i10 % 128;
        int i11 = i10 % 2;
        String strM5132 = m5132(offerCacheEntity);
        int i12 = f985 + 89;
        f984 = i12 % 128;
        int i13 = i12 % 2;
        return strM5132;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static PreloadedVastData m5128(DependencyHolder dependencyHolder) {
        int i10 = f985 + 107;
        f984 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            dependencyHolder.getPreloadedData();
            throw null;
        }
        PreloadedVastData preloadedData = dependencyHolder.getPreloadedData();
        int i11 = f984 + 125;
        f985 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 30 : '\t') == '\t') {
            return preloadedData;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m5129(String str) {
        int i10 = f985 + 17;
        f984 = i10 % 128;
        int i11 = i10 % 2;
        Object objM5123 = m5123(str);
        int i12 = f984 + 37;
        f985 = i12 % 128;
        int i13 = i12 % 2;
        return objM5123;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5130(Ad ad2) {
        int i10 = f985 + 83;
        f984 = i10 % 128;
        int i11 = i10 % 2;
        String str = ad2.type;
        int i12 = f984 + 67;
        f985 = i12 % 128;
        int i13 = i12 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static PlacementController m5131(HyprMXController hyprMXController) {
        int i10 = f985 + 89;
        f984 = i10 % 128;
        int i11 = i10 % 2;
        PlacementController placementController = hyprMXController.getPlacementController();
        int i12 = f985 + 15;
        f984 = i12 % 128;
        int i13 = i12 % 2;
        return placementController;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5132(OfferCacheEntity offerCacheEntity) {
        int i10 = f985 + 11;
        f984 = i10 % 128;
        int i11 = i10 % 2;
        String str = offerCacheEntity.clickThroughUrl;
        int i12 = f984 + 119;
        f985 = i12 % 128;
        int i13 = i12 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m5133(DependencyHolder dependencyHolder) {
        int i10 = f984 + 81;
        f985 = i10 % 128;
        char c10 = i10 % 2 != 0 ? (char) 14 : (char) 2;
        String strM5138 = m5138(dependencyHolder);
        if (c10 == 14) {
            int i11 = 94 / 0;
        }
        return strM5138;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m5134(PreloadedVastData preloadedVastData) {
        int i10 = f985 + 7;
        f984 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '.' : (char) 0;
        JSONObject jSONObjectM5140 = m5140(preloadedVastData);
        if (c10 == '.') {
            int i11 = 74 / 0;
        }
        return jSONObjectM5140;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5135(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f987[i10 + i12]) ^ (((long) i12) * f986)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m5136(WebTrafficObject webTrafficObject) {
        int i10 = f985 + 123;
        f984 = i10 % 128;
        if ((i10 % 2 == 0 ? 'Z' : 'X') == 'Z') {
            m5139(webTrafficObject);
            throw null;
        }
        List<WebTrafficObject.WebTrafficURL> listM5139 = m5139(webTrafficObject);
        int i11 = f985 + 113;
        f984 = i11 % 128;
        if (i11 % 2 != 0) {
            return listM5139;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ PlacementController m5137(HyprMXController hyprMXController) {
        int i10 = f985 + 35;
        f984 = i10 % 128;
        int i11 = i10 % 2;
        PlacementController placementControllerM5131 = m5131(hyprMXController);
        int i12 = f984 + 97;
        f985 = i12 % 128;
        int i13 = i12 % 2;
        return placementControllerM5131;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5138(DependencyHolder dependencyHolder) {
        int i10 = f985 + 19;
        f984 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        String distributorId = dependencyHolder.getDistributorId();
        if (z10) {
            int i11 = 1 / 0;
        }
        int i12 = f984 + 51;
        f985 = i12 % 128;
        if ((i12 % 2 != 0 ? '\n' : (char) 7) != '\n') {
            return distributorId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<WebTrafficObject.WebTrafficURL> m5139(WebTrafficObject webTrafficObject) {
        int i10 = f984 + 105;
        f985 = i10 % 128;
        int i11 = i10 % 2;
        List<WebTrafficObject.WebTrafficURL> list = webTrafficObject.urls;
        int i12 = f984 + 93;
        f985 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return list;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m5140(PreloadedVastData preloadedVastData) {
        int i10 = f984 + 45;
        f985 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject parameters = preloadedVastData.getParameters();
        int i12 = f985 + 1;
        f984 = i12 % 128;
        if (i12 % 2 != 0) {
            return parameters;
        }
        int i13 = 6 / 0;
        return parameters;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5135(TextUtils.lastIndexOf("", '0') + 865, (char) (57004 - Drawable.resolveOpacity(0, 0)), View.MeasureSpec.getMode(0) + 23).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bp.m5136((WebTrafficObject) list.get(0));
            }
        });
        map.put(m5135(ExpandableListView.getPackedPositionChild(0L) + 888, (char) (View.MeasureSpec.getSize(0) + 16919), TextUtils.indexOf((CharSequence) "", '0', 0) + 29).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bp.m5127((OfferCacheEntity) list.get(0));
            }
        });
        map.put(m5135(Color.alpha(0) + 915, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 62836), 10 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bp.m5126((Ad) list.get(0));
            }
        });
        map.put(m5135(924 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 21).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bp.m5129((String) list.get(0));
            }
        });
        map.put(m5135((Process.myPid() >> 22) + 944, (char) KeyEvent.getDeadChar(0, 0), TextUtils.lastIndexOf("", '0', 0) + 28).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bp.m5124();
            }
        });
        map.put(m5135(Drawable.resolveOpacity(0, 0) + 971, (char) View.combineMeasuredStates(0, 0), 16 - (Process.myPid() >> 22)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bp.m5133((DependencyHolder) list.get(0));
            }
        });
        map.put(m5135(987 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 57790), 22 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bp.m5137((HyprMXController) list.get(0));
            }
        });
        map.put(m5135(1010 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (58163 - TextUtils.getOffsetAfter("", 0)), 16 - Color.argb(0, 0, 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bp.m5125((DependencyHolder) list.get(0));
            }
        });
        map.put(m5135(TextUtils.indexOf("", "", 0) + 1025, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 12 - TextUtils.lastIndexOf("", '0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bp.m5134((PreloadedVastData) list.get(0));
            }
        });
        int i10 = f984 + 1;
        f985 = i10 % 128;
        if ((i10 % 2 != 0 ? '#' : 'T') != '#') {
            return map;
        }
        int i11 = 87 / 0;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        int i10 = f984 + 21;
        f985 = i10 % 128;
        int i11 = i10 % 2;
        try {
            try {
                String str = (String) BuildConfig.class.getDeclaredField(m5135(MotionEvent.axisFromString("") + 1, (char) (38828 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.resolveSize(0, 0) + 12).intern()).get(null);
                int i12 = f985 + 37;
                f984 = i12 % 128;
                if ((i12 % 2 == 0 ? '\f' : ']') != '\f') {
                    return str;
                }
                int i13 = 54 / 0;
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return hu.m6425().m6427().m6527(BuildConfig.class, m5135(13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42295), '<' - AndroidCharacter.getMirror('0')).intern());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo4814(String str) {
        byte b10;
        switch (str.hashCode()) {
            case -2118473762:
                b10 = !str.equals(m5135(ExpandableListView.getPackedPositionChild(0L) + 25, (char) TextUtils.getTrimmedLength(""), ((Process.getThreadPriority(0) + 20) >> 6) + 6).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -2115661176:
                b10 = !str.equals(m5135((ViewConfiguration.getFadingEdgeLength() >> 16) + 508, (char) View.combineMeasuredStates(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 31).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -2082076211:
                b10 = !str.equals(m5135(764 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (36606 - Color.alpha(0)), TextUtils.getCapsMode("", 0, 0) + 28).intern()) ? (byte) -1 : (byte) 29;
                break;
            case -2060981001:
                b10 = !str.equals(m5135(Color.rgb(0, 0, 0) + 16777277, (char) ((-1) - TextUtils.lastIndexOf("", '0')), (Process.myTid() >> 22) + 16).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -1783324338:
                if (!str.equals(m5135(View.combineMeasuredStates(0, 0) + Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 54).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f984 + 123;
                    f985 = i10 % 128;
                    b10 = (i10 % 2 != 0 ? ',' : (char) 4) == ',' ? (byte) 111 : (byte) 10;
                }
                break;
            case -1711062568:
                b10 = (str.equals(m5135(TextUtils.indexOf("", "", 0) + 110, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1364), View.MeasureSpec.getMode(0) + 31).intern()) ? (char) 4 : '?') == '?' ? (byte) -1 : (byte) 7;
                break;
            case -1632261541:
                b10 = !str.equals(m5135(Color.blue(0) + 661, (char) (61352 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 13).intern()) ? (byte) -1 : (byte) 24;
                break;
            case -1625751435:
                b10 = !str.equals(m5135(Color.alpha(0) + 395, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 46805), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 65).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -1429076201:
                b10 = !str.equals(m5135(633 - TextUtils.getOffsetAfter("", 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21438), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28).intern()) ? (byte) -1 : (byte) 23;
                break;
            case -1345825871:
                if (!str.equals(m5135(TextUtils.getCapsMode("", 0, 0) + 94, (char) View.MeasureSpec.getSize(0), MotionEvent.axisFromString("") + 17).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f984 + 105;
                    f985 = i11 % 128;
                    int i12 = i11 % 2;
                    b10 = 6;
                }
                break;
            case -1289932600:
                b10 = !str.equals(m5135(TextUtils.indexOf("", "", 0, 0) + 554, (char) (Color.red(0) + 6238), ExpandableListView.getPackedPositionType(0L) + 16).intern()) ? (byte) -1 : (byte) 19;
                break;
            case -1102538544:
                if (!str.equals(m5135((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 717, (char) (56532 - ExpandableListView.getPackedPositionGroup(0L)), (Process.myTid() >> 22) + 26).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f985 + 113;
                    f984 = i13 % 128;
                    int i14 = i13 % 2;
                    b10 = 27;
                }
                break;
            case -1056910325:
                if (!str.equals(m5135(141 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15118), 63 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i15 = f984 + 7;
                    f985 = i15 % 128;
                    int i16 = i15 % 2;
                    b10 = 8;
                }
                break;
            case -793729563:
                if ((str.equals(m5135((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 203, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21).intern()) ? (char) 24 : (char) 11) == 24) {
                    int i17 = f985 + 61;
                    f984 = i17 % 128;
                    int i18 = i17 % 2;
                    b10 = 9;
                } else {
                    b10 = -1;
                }
                break;
            case -684201479:
                b10 = !str.equals(m5135(744 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 55638), 19 - TextUtils.indexOf((CharSequence) "", '0')).intern()) ? (byte) -1 : (byte) 28;
                break;
            case -411143178:
                b10 = !str.equals(m5135(ImageFormat.getBitsPerPixel(0) + 306, (char) (23876 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 56 - ExpandableListView.getPackedPositionChild(0L)).intern()) ? (byte) -1 : (byte) 12;
                break;
            case -352824194:
                b10 = !str.equals(m5135((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 77, (char) (57591 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -58290677:
                b10 = !str.equals(m5135(484 - View.resolveSize(0, 0), (char) (13149 - (ViewConfiguration.getTouchSlop() >> 8)), ExpandableListView.getPackedPositionGroup(0L) + 24).intern()) ? (byte) -1 : (byte) 16;
                break;
            case -52302939:
                b10 = (str.equals(m5135((KeyEvent.getMaxKeyCode() >> 16) + 812, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52).intern()) ? '^' : '+') == '^' ? (byte) 31 : (byte) -1;
                break;
            case -48720897:
                b10 = !str.equals(m5135((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 280, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 25 - (KeyEvent.getMaxKeyCode() >> 16)).intern()) ? (byte) -1 : (byte) 11;
                break;
            case 2115:
                b10 = !str.equals(m5135(59 - (ViewConfiguration.getTapTimeout() >> 16), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), KeyEvent.keyCodeFromString("") + 2).intern()) ? (byte) -1 : (byte) 3;
                break;
            case 5206681:
                b10 = (str.equals(m5135(Drawable.resolveOpacity(0, 0) + 791, (char) (Color.green(0) + 24354), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 21).intern()) ? (char) 4 : '>') == 4 ? (byte) 30 : (byte) -1;
                break;
            case 99044255:
                b10 = !str.equals(m5135(46 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 13).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 217655834:
                if (!str.equals(m5135(30 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15).intern())) {
                    b10 = -1;
                } else {
                    int i19 = f985 + 21;
                    f984 = i19 % 128;
                    int i20 = i19 % 2;
                    b10 = 1;
                }
                break;
            case 748493318:
                b10 = !str.equals(m5135(KeyEvent.getDeadChar(0, 0) + 674, (char) (Process.getGidForName("") + 9541), 19 - Color.red(0)).intern()) ? (byte) -1 : (byte) 25;
                break;
            case 902272186:
                if (!str.equals(m5135(608 - ExpandableListView.getPackedPositionGroup(0L), (char) (View.MeasureSpec.getSize(0) + 22057), (ViewConfiguration.getTapTimeout() >> 16) + 25).intern())) {
                    b10 = -1;
                } else {
                    int i21 = f984 + 115;
                    f985 = i21 % 128;
                    int i22 = i21 % 2;
                    b10 = 22;
                }
                break;
            case 1056638846:
                b10 = (str.equals(m5135(362 - View.combineMeasuredStates(0, 0), (char) View.combineMeasuredStates(0, 0), 32 - ImageFormat.getBitsPerPixel(0)).intern()) ? '\r' : '$') == '$' ? (byte) -1 : (byte) 13;
                break;
            case 1527993897:
                b10 = !str.equals(m5135(Color.red(0) + 538, (char) TextUtils.getCapsMode("", 0, 0), Process.getGidForName("") + 17).intern()) ? (byte) -1 : (byte) 18;
                break;
            case 1564846544:
                b10 = str.equals(m5135((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 460, (char) (KeyEvent.keyCodeFromString("") + 56522), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24).intern()) ? (byte) 15 : (byte) -1;
                break;
            case 1575934042:
                b10 = (str.equals(m5135(692 - TextUtils.lastIndexOf("", '0', 0), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13767), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24).intern()) ? '-' : '4') == '4' ? (byte) -1 : (byte) 26;
                break;
            case 1775126662:
                b10 = str.equals(m5135(571 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (19674 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 13 - TextUtils.getOffsetAfter("", 0)).intern()) ? (byte) 20 : (byte) -1;
                break;
            case 1872662391:
                b10 = !(str.equals(m5135(Process.getGidForName("") + 584, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 56542), 25 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()) ? false : true) ? (byte) 21 : (byte) -1;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return HyprMX.class;
            case 1:
                return HyprMXController.class;
            case 2:
                return PlacementType.class;
            case 3:
                return Ad.class;
            case 4:
                return DependencyHolder.class;
            case 5:
                return PreloadedVastData.class;
            case 6:
                return HyprMXProperties.class;
            case 7:
            case 8:
                int i23 = f985 + 13;
                f984 = i23 % 128;
                if (i23 % 2 != 0) {
                    return HyprMXWebViewWithClosableNavBar.class;
                }
                throw null;
            case 9:
            case 10:
                return HyprMXNoOffersActivity.class;
            case 11:
            case 12:
                int i24 = f985 + 43;
                f984 = i24 % 128;
                if (i24 % 2 != 0) {
                    return HyprMXOfferViewerActivity.class;
                }
                int i25 = 34 / 0;
                return HyprMXOfferViewerActivity.class;
            case 13:
            case 14:
                return HyprMXRequiredInformationActivity.class;
            case 15:
                return HyprMXBaseViewController.class;
            case 16:
                return HyprMXVastViewController.class;
            case 17:
                return HyprMXWebTrafficViewController.class;
            case 18:
                return OfferCacheEntity.class;
            case 19:
                return WebTrafficObject.class;
            case 20:
                return WebTrafficObject.WebTrafficURL.class;
            case 21:
                int i26 = f985 + 51;
                f984 = i26 % 128;
                int i27 = i26 % 2;
                return HyprMXLearnMoreController.class;
            case 22:
                return HyprMXMraidViewController.class;
            case 23:
                return HyprMXOfferWebViewController.class;
            case 24:
                return HyprMXWebView.class;
            case 25:
                return HyprMXWebViewClient.class;
            case 26:
                return OfferViewerHandler.class;
            case 27:
                return OfferViewerHandler.OfferViewerHandlerListener.class;
            case 28:
                return HyprMXSkipController.class;
            case 29:
                return HyprMXSkipController.Listener.class;
            case 30:
            case 31:
                return HyprMXBrowserActivity.class;
            default:
                return null;
        }
    }
}
