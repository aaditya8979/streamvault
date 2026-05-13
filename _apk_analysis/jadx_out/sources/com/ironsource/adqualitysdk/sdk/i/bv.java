package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class bv extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1067 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1068 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1069 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1070;

    static {
        char[] cArr = new char[1352];
        ByteBuffer.wrap("\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_,óÚ\u0088w\u001c7°ÓD\u009eÙ^mâ\u0001\u009f\u0096^*\u0014¾½Sjç\r{Å\u0010G¤68ÐÌ\u009aa4õø\u0089\u0094\u001eV{Úï\u0099SJÇz*ã\u009eK\u0002\u0001uõÙ³MP°Æ$²\u0088cóßg\u0099Ëy?*¢ò\u0016^z\u0012íðQìÅ\u0000(Ä\u009cº\u0000 kÞß\u008fCi·#\u001a\u008d\u008eAò-eÿÉ¢=\u0007 \u008b\u0014\u009bxmãÞW\u0084»l/.\u0092\u009f\u0006Yj3ÝýA]µ \u0018È\u008c£ða[ÇÏ\u008c3r§,\n³~\\â0Uû¹N-\u000f\u0090é\u0004\u0089h\u001aÓÂG\u008e«b\u001f,\u0082\u0086öZ\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_#óÁ\u0088o\u001c>°ÒD\u0093ÙMmë\u0001¸\u0096B*:¾®SXç\u000b{Ã\u0010o¤#8ÍÌ\u0087a;¬Ò8\u0091\u0084B\u0010rýëICÕ\t¢ý\u000e»\u009aXgÎóº_k$×°\u0091\u001cqè\"uúÁV\u00ad\u001a:ø\u0086ä\u0012\bÿÌK²×(¼Ö\b\u0087\u0094a`+Í\u0085YI%%²÷\u001eªê\u000fw\u0083Ã\u0093¯e4Ö\u0080\u008cldø&E\u0097ÑQ½;\nõ\u0096Ub'ÏÛ[³'`\u008cÎ\u0018\u0089äip-Ý\u009c©H5\u0016\u0082àntú\u0001GçÓ©¿\u0007\u0004×\u0090\u009b|e\u0080\u0003\u0014k¨º<ÂÑ\u0004e ùó\u008e\u0017\"[¶ûK9ß}s\u0097\b*\u009cp0¦ÄßY\u0011í\u00ad\u0081ö\u00160ªX>äÓ6gMû\u00ad\u0090 $~¸\u0097LÜázu\u009a\tÉ\u009e\u00112]Æñ[?ïU\u0083\u0089\u0018\u0000¬}@\u009fÔÙ¥¼1ÿ\u008d,\u0019\u001cô\u0085@-Üg«\u0093\u0007Õ\u00936n úÔV\u0005-¹¹ÿ\u0015\u001fáL|\u0094È8¤t3\u0096\u008f\u008a\u001bfö¢BÜÞFµ¸\u0001é\u009d\u000fiEÄëP',K»\u0099\u0017Äãa~íÊý¦\u000b=¸\u0089âe\nñHLùØ?´U\u0003\u009b\u009f;k]Æ©RÒ.\n\u0085\u009e\u0011áí\u0011yOÔö \u001e<P\u008b\u008eg>ócN\u00adÚÂ¶~\r©\u0099äu\u0000Áb\\÷(1\u0084_\u0013\u0091ï1{}Ö\u0083¢è>s\u0095¿aÛ\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_$óÐ\u0088P\u001c\"°ÎD\u0084\u0017\u009d\u0083õ?$«\\F\u009aò>nm\u0019\u0089µÅ!eÜ§Hðä\u0004\u009f\u0085\u000bã§\u0004SQÎ\u008ez)\u0016}\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_$óÐ\u0088Q\u001c7°ÏD\u0094ÙZmü\u0001¸\u0096^\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_(óÑ\u0088g\u001c;°ÀD\u0084ÙVmá\u0001³\u0096b*\u001a¾§S|EgÑ móù¬\u0014| Ã<\u009dK`ç\u001bs\u0088\u008eV\u001a*¶ýÍHY\u000e\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_&óÛ\u0088m\u001c&°ÄD\u009eÙKmÍ\u0001²\u0096B*\u000f¾¸Svç\u0004{Û\u0010c¤'\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_0óÚ\u0088j\u001c&°âD\u009fÙQmú\u0001¯\u0096C*\u0017¾¦S|ç\u001aå\u0092qúÍ+YS´\u0095\u00001\u009cbë\u0086GÊÓj.¨ºÿ\u0016\u000bm\u008eùàU\u001f¡\\<±\u0088;äos\u0083Ïã[~¶¬\u0002Ç\u009e\u001eõ²AâÝ\u0013)M\u0084ëDËÐ¿liø\u0007\u0015æ¡|=7JÇæ\u008ar8\u008fñ\u001b¯·SÌíX©\u0000E\u00949(û¼\u0083QHåøy\u0096\u000e@¢\u000b6³Ës_\u000bóÑ\u0088q\u0000R\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_#óÁ\u0088o\u001c>°ÒD\u0093ÙMmë\u0001¸\u0096B*-¾£S}ç\r{Ø\u0010E¤:8ÊÌ\u0087a'õÿ\u0089\u0094\u001el²\u0011F£Ûho\u0019\u0003Õ\u0098e,4ÀÂT\u0084\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_#óÁ\u0088o\u001c>°ÒD\u0093ÙMmë\u0001¸\u0096B*:¾®S\\ç\u001e{Ò\u0010h¤!8×Ì¿a+õâ\u0089\u0094\u001eJ²\u0010F¨Ûnªm>\u001d\u0082Á\u0016³ûhOóÓ\u008e¤|\b7\u009c\u0099aCõ*YÃ\"Q¶\u001a\u001aîî®sjÇÐ«\u0094\u0099B\r*±á%\u0083ÈE|îà°\u0097N;1¯¾RrÆ\u0019jÌ\u0011m\u0085+)æÝ\u0092@Gôñ\u0098³\u000fI³\u0015'³\u0000T\u0094.(î\u0002\u0004\u0096l*½¾ÅS\u0003ç§{ô\f\u0010 \\4üÉ>]nñ\u008c\u008a\"\u001es²\u009fFÞÛ\u0000o¦\u0003õ\u0094\u000f(w¼ãQ\u0011åSy\u009f\u0012%¦l:\u009aÎòcf÷¯\u008bÙ\u001c\u0007°]DåÙ#mg\u0001\u0093\u009a%.eÂ\u009eVÞëzîJz\"ÆóR\u008b¿M\u000bé\u0097ºà^L\u0012Ø²%p± \u001dÂflò=^Ñª\u00907N\u0083èï»xAÄ-P§½s\t\u001f\u0095÷þjJ8ÖÓ\"\u0082\u008f.\u001bþg\u008fðI\\\u000f\u0091·\u0005ß¹\u000e-vÀ°t\u0014èG\u009f£3ï§OZ\u008dÎÚb.\u0019«\u008dÅ!:ÕyH\u0097ü\u0019\u0090G\u0007·»ê/wÂ\u0088vøê=\u0081\u009d5Å©.]NðÓd\u0001\u0018j\u008f£#ï×_J\u008eþð\u00926\u0000E\u00949(û¼\u0083QHåøy\u0096\u000e@¢\u000b6³Ës_\u000bóÑ\u0088q\u001c\u0013°ÅD\u0091ÙOmú\u0001¸\u0096^ðâd\u0092ØNL<¡ç\u0015|\u0089\u0001þóR¸Æ\u0016;Ì¯¥\u0003LxÞì\u0095@a´!)å\u009d_ñ\u001bfÙÚ«N\u001f£Ý\u0017¨\u008bfàÀ\u0000I\u0094\u000e(Ó¼\u009fQ]åây¾\u000eb¢\u00116³\u0000I\u0094\u000e(ó¼\u009fQ]åây¾\u000e~¢\u001d6¥Ë@_\fóÑ\u0088t\u001c\u0011°ÎD\u009eÙKmü\u0001²\u0096@*\u0017¾¯Sk\u000e£\u009aä&\"²n_²ë\u0004w_\u0000\u0088¬û8Y\u0000I\u0094\"(î¼\u009fQYåøy©\u000e@¢\u00176©ËR_\u0004óÀ\u0088b\u0095:\u0001}½\u009f)÷Ä,p\u0090ìä\u009b?7o£Ý^\u0004Ê@f®\u001d\u0014\u0089D%½ÑÕL%ø\u0098\u0094Ù\u0000B\u0094.(í¼\u0088Qjåây¾\u000eL¢\u00176\u0091Ë\u007f_\u0000óÃ\u0088O\u001c;°ÒD\u0084ÙZmà\u0001¸\u0096^\u0000I\u0094!(ð¼\u0088QNåêy¹\u000e]¢\u00116±Ës_#óÁ\u0088o\u001c>°ÒD\u0093ÙMmë\u0001¸\u0096B*:¾®S\\ç\u001e{Ò\u0010h¤!8×Ì¿a+õâ\u0089\u0094\u001eJ²\u0010F¨Ûno<\u0003Ó\u0098},0ÀîT\u009bé5}æ\u0011\u0086¦A:òÎ¹cp÷\u0000\u008bù m´/HË\t4\u009d\\!\u008dµõX3ì\u0097pÄ\u0007 «l?ÌÂ\u000eVYú\u00ad\u0081(\u0015F¹¹MúÐ\u0007d\u0085\bÅ\u009f?#r·ÄZ(î|r¹\u0019\u000f\u00adM1·ÅëhMü»\u0080ô\u0017&»kOùÒ\fff\nµ\u0091\u0011%VÉ©]âàWt\u0087\u0018Ú¯.3\u0088ÇÌ\u0000g\u0094*(ê¼®QIåùy¨\u000eL¢\u00166³ËF_\u0017óÛ\u0088`\u001c7°ÒD\u0083ÙZmê\u0001\u008f\u0096I*\n¾¿S|ç\u001b{Ã\u001c¨\u0088å4% qM\u0083ù+ea\u0012¯¾Ó\u0000g\u0094*(ê¼¬QXåÈyµ\u000eG¢\f6¢Ëx_\u0011/¢»÷\u0007\u0013\u0093S~\u009bÊ,Vb!\u0081\u008dÁ\u0019iä¸pÀÜ>§¬Â\u0090VÅê1~}\u0093¡'\u0017»LÌ\u0091`å1\u008a¥Ç\u0019\u0007\u008dC`½Ô\u000fHT?¯\u0093Á\u0007Bú\u0089nçÂ,¹\u0089-×\u0081\u0019uoè¾\u0000g\u0094*(ê¼¡Q]åòyµ\u000e\\¢\f® :m\u0086\u00ad\u0012ùÿ\u001eK ×ø \r\fK\u0098åe5ñw]\u009d&-²a\u001e¥êØw\u0016Ã½¯è8\u0004\u0084P\u0010áý;I]MôÙ¹eyñ-\u001cÊ¨t4,CÙï\u009f{1\u0086á\u0012µ¾HÅþQµýW\t\r\u0094Ø ^L!ÛÑg\u009có+\u001eåª\u00976H]ðé´\u0000g\u0094*(ê¼¨QJåîy´\u000e]¢\u000b6\u008bË\u007f_\u0016óÀ\u0088f\u001c<°ÄD\u0082\u0000s\u0094*(ê¼¨QJåîy´\u000e]¢\u000b6\u008bË\u007f_\u0016óÀ\u0088f\u001c<°ÄD\u0082/\u0011»\\\u0007\u009c\u0093Ú~.Ê®VÜ!0\u008dzÆPR\u001dîÝz\u008f\u0097e#Õ¿\u0099ÈZd&ð\u0083\rQ\u0099>5âNMÚ1vï\u0082·\u001fm«üÇ\u0084Pnì!\u0000g\u0094*(ê¼ QNåêy³\u000eM¢:6¦Ëx_\u000bóÑ\u0088q\u001c\u0004°ÈD\u0095ÙHmÇ\u0001¹»#/n\u0093®\u0007àê\u0015^¿Âìµ\b\u0019O\u008dðp;äNH\u009e3\u0003§w\u000b\u0091ÿÕb?Ö¥ºô-\t\u0091V\u0005à\u009e\u0015\n]¶\u0096\"ôÏ2{\u0084çÒ\u0090<<p¨ÒU\u000bÁuà\u0097tÕÈ\u000b\\r±´\u0005\u0013\u0099@î¢Bæ2Î¦\u009e\u001aX\u008e-cë«~?2\u0083ì\u0017\u009fúENå\u0000R\u0094\n(É¼¬QnåÏy\u009f\u000emµþ!³\u009df\t\u0001äÃPc\u0016\u0088\u0082Ô>\u0012ªgG«ó\u0016oE\u0018»\u0000D\u0094\n(Ø¼¬QiåÇy\u008e".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1352);
        f1067 = cArr;
        f1070 = -2745927091437923249L;
    }

    public bv(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static String m5241(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1069 + 23;
        f1068 = i10 % 128;
        int i11 = i10 % 2;
        String clickThroughUrl = inneractiveAdSpot.getAdContent().getClickThroughUrl();
        int i12 = f1069 + 107;
        f1068 = i12 % 128;
        if ((i12 % 2 != 0 ? 'W' : 'S') != 'W') {
            return clickThroughUrl;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static InneractiveUnitController m5242(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1069 + 65;
        f1068 = i10 % 128;
        if ((i10 % 2 != 0 ? '?' : (char) 23) == 23) {
            return inneractiveAdSpot.getSelectedUnitController();
        }
        inneractiveAdSpot.getSelectedUnitController();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ int m5243() {
        int i10 = f1068 + 61;
        f1069 = i10 % 128;
        int i11 = i10 % 2;
        int iM5245 = m5245();
        int i12 = f1068 + 41;
        f1069 = i12 % 128;
        if (i12 % 2 != 0) {
            return iM5245;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static boolean m5244(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1069 + 29;
        f1068 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        com.fyber.inneractive.sdk.c.f adContent = inneractiveAdSpot.getAdContent();
        if (!z10) {
            adContent.isFullscreenAd();
            throw null;
        }
        boolean zIsFullscreenAd = adContent.isFullscreenAd();
        int i11 = f1069 + 37;
        f1068 = i11 % 128;
        int i12 = i11 % 2;
        return zIsFullscreenAd;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int m5245() {
        int i10 = f1068 + 53;
        f1069 = i10 % 128;
        if ((i10 % 2 == 0 ? 'R' : (char) 0) == 0) {
            return R.id.inneractive_webview_mraid;
        }
        int i11 = 21 / 0;
        return R.id.inneractive_webview_mraid;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static InneractiveAdRequest m5246(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1069 + 95;
        f1068 = i10 % 128;
        int i11 = i10 % 2;
        InneractiveAdRequest currentProcessedRequest = inneractiveAdSpot.getCurrentProcessedRequest();
        int i12 = f1069 + 91;
        f1068 = i12 % 128;
        if (i12 % 2 == 0) {
            return currentProcessedRequest;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static Enum m5247(String str) {
        byte b10 = 7;
        switch (str.hashCode()) {
            case -2032180703:
                if (!str.equals(m5262(View.getDefaultSize(0, 0) + 1345, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Color.alpha(0) + 7).intern())) {
                    b10 = -1;
                }
                break;
            case -1841345251:
                b10 = (str.equals(m5262(1331 - Color.argb(0, 0, 0, 0), (char) (46510 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6).intern()) ? '_' : (char) 28) == 28 ? (byte) -1 : (byte) 5;
                break;
            case -1372958932:
                if (str.equals(m5262((-16775925) - Color.rgb(0, 0, 0), (char) (40540 - View.MeasureSpec.getSize(0)), Color.alpha(0) + 12).intern())) {
                    int i10 = f1068;
                    int i11 = i10 + 93;
                    f1069 = i11 % 128;
                    b10 = i11 % 2 == 0 ? (byte) 1 : (byte) 0;
                    int i12 = i10 + 121;
                    f1069 = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    b10 = -1;
                }
                break;
            case -1201514634:
                if (!str.equals(m5262(1337 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.indexOf("", "") + 5854), TextUtils.indexOf("", "", 0) + 8).intern())) {
                    b10 = -1;
                } else {
                    int i14 = f1069 + 55;
                    f1068 = i14 % 128;
                    int i15 = i14 % 2;
                    b10 = 6;
                }
                break;
            case -77725029:
                b10 = (str.equals(m5262(MotionEvent.axisFromString("") + 1304, (char) (57563 - TextUtils.indexOf("", "", 0)), (Process.myPid() >> 22) + 9).intern()) ? (char) 15 : '9') == '9' ? (byte) -1 : (byte) 1;
                break;
            case 73622449:
                if (!str.equals(m5262(Color.alpha(0) + 1312, (char) (TextUtils.getTrimmedLength("") + 12931), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4).intern())) {
                    b10 = -1;
                } else {
                    int i16 = f1068 + 105;
                    f1069 = i16 % 128;
                    int i17 = i16 % 2;
                    b10 = 2;
                }
                break;
            case 543046670:
                if ((str.equals(m5262(1323 - TextUtils.getTrimmedLength(""), (char) View.MeasureSpec.makeMeasureSpec(0, 0), ExpandableListView.getPackedPositionType(0L) + 8).intern()) ? (char) 2 : 'X') == 'X') {
                    b10 = -1;
                } else {
                    int i18 = f1069 + 61;
                    f1068 = i18 % 128;
                    int i19 = i18 % 2;
                    b10 = 4;
                }
                break;
            case 1951953708:
                if ((str.equals(m5262(1317 - View.resolveSizeAndState(0, 0, 0), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43836), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6).intern()) ? '\f' : ',') == ',') {
                    b10 = -1;
                } else {
                    int i20 = f1069 + 51;
                    f1068 = i20 % 128;
                    int i21 = i20 % 2;
                    b10 = 3;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return UnitDisplayType.INTERSTITIAL;
            case 1:
                return UnitDisplayType.LANDSCAPE;
            case 2:
                return UnitDisplayType.MRECT;
            case 3:
                return UnitDisplayType.BANNER;
            case 4:
                return UnitDisplayType.REWARDED;
            case 5:
                return UnitDisplayType.SQUARE;
            case 6:
                return UnitDisplayType.VERTICAL;
            case 7:
                return UnitDisplayType.DEFAULT;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static Object m5248(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1068 + 87;
        f1069 = i10 % 128;
        int i11 = i10 % 2;
        com.fyber.inneractive.sdk.c.f adContent = inneractiveAdSpot.getAdContent();
        int i12 = f1069 + 111;
        f1068 = i12 % 128;
        if ((i12 % 2 != 0 ? 'V' : (char) 18) == 18) {
            return adContent;
        }
        int i13 = 80 / 0;
        return adContent;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveUnitController m5249(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1069 + 3;
        f1068 = i10 % 128;
        if ((i10 % 2 != 0 ? '[' : (char) 17) == 17) {
            return m5242(inneractiveAdSpot);
        }
        m5242(inneractiveAdSpot);
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static boolean m5250(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1069 + 45;
        f1068 = i10 % 128;
        int i11 = i10 % 2;
        boolean zIsVideoAd = inneractiveAdSpot.getAdContent().isVideoAd();
        int i12 = f1068 + 51;
        f1069 = i12 % 128;
        int i13 = i12 % 2;
        return zIsVideoAd;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static InneractiveAdSpot m5251(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        int i10 = f1069 + 21;
        f1068 = i10 % 128;
        int i11 = i10 % 2;
        InneractiveAdSpot adSpot = inneractiveAdViewUnitController.getAdSpot();
        int i12 = f1069 + 81;
        f1068 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 5 : '3') == '3') {
            return adSpot;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveContentController.EventsListener m5252(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        int i10 = f1069 + 7;
        f1068 = i10 % 128;
        int i11 = i10 % 2;
        InneractiveContentController.EventsListener eventsListenerM5267 = m5267(inneractiveFullscreenVideoContentController);
        int i12 = f1068 + 65;
        f1069 = i12 % 128;
        if ((i12 % 2 == 0 ? 'b' : '!') == '!') {
            return eventsListenerM5267;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Object m5253(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        int i10 = f1068 + 31;
        f1069 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '2' : '\b';
        ViewGroup layout = inneractiveFullscreenAdActivity.getLayout();
        if (c10 != '\b') {
            int i11 = 85 / 0;
        }
        int i12 = f1069 + 89;
        f1068 = i12 % 128;
        int i13 = i12 % 2;
        return layout;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m5254(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1069 + 95;
        f1068 = i10 % 128;
        int i11 = i10 % 2;
        Object objM5248 = m5248(inneractiveAdSpot);
        int i12 = f1069 + 105;
        f1068 = i12 % 128;
        if (i12 % 2 == 0) {
            return objM5248;
        }
        int i13 = 63 / 0;
        return objM5248;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5255(ImpressionData impressionData) {
        int i10 = f1069 + 81;
        f1068 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '\t' : 'X';
        String advertiserDomain = impressionData.getAdvertiserDomain();
        if (c10 != 'X') {
            int i11 = 24 / 0;
        }
        int i12 = f1069 + 125;
        f1068 = i12 % 128;
        int i13 = i12 % 2;
        return advertiserDomain;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m5256(InneractiveAdRequest inneractiveAdRequest) {
        int i10 = f1069 + 65;
        f1068 = i10 % 128;
        int i11 = i10 % 2;
        String strM5263 = m5263(inneractiveAdRequest);
        int i12 = f1068 + 35;
        f1069 = i12 % 128;
        int i13 = i12 % 2;
        return strM5263;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Enum m5257(String str) {
        int i10 = f1069 + 89;
        f1068 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        Enum enumM5247 = m5247(str);
        if (!z10) {
            int i11 = 15 / 0;
        }
        int i12 = f1068 + 91;
        f1069 = i12 % 128;
        if ((i12 % 2 == 0 ? '.' : '#') != '.') {
            return enumM5247;
        }
        int i13 = 97 / 0;
        return enumM5247;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m5258(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        int i10 = f1068 + 87;
        f1069 = i10 % 128;
        int i11 = i10 % 2;
        Object objM5253 = m5253(inneractiveFullscreenAdActivity);
        int i12 = f1069 + 103;
        f1068 = i12 % 128;
        int i13 = i12 % 2;
        return objM5253;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m5259(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1068 + 103;
        f1069 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        boolean zM5244 = m5244(inneractiveAdSpot);
        if (z10) {
            int i11 = 90 / 0;
        }
        int i12 = f1069 + 93;
        f1068 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return zM5244;
        }
        int i13 = 1 / 0;
        return zM5244;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveAdRequest m5260(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1068 + 93;
        f1069 = i10 % 128;
        int i11 = i10 % 2;
        InneractiveAdRequest inneractiveAdRequestM5246 = m5246(inneractiveAdSpot);
        int i12 = f1069 + 7;
        f1068 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return inneractiveAdRequestM5246;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Object m5261(InneractiveUnitController inneractiveUnitController) {
        int i10 = f1069 + 43;
        f1068 = i10 % 128;
        int i11 = i10 % 2;
        InneractiveContentController selectedContentController = inneractiveUnitController.getSelectedContentController();
        int i12 = f1069 + 29;
        f1068 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 26 : '\f') != 26) {
            return selectedContentController;
        }
        int i13 = 33 / 0;
        return selectedContentController;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5262(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1067[i10 + i12]) ^ (((long) i12) * f1070)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5263(InneractiveAdRequest inneractiveAdRequest) {
        int i10 = f1069 + 103;
        f1068 = i10 % 128;
        int i11 = i10 % 2;
        String spotId = inneractiveAdRequest.getSpotId();
        int i12 = f1068 + 15;
        f1069 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return spotId;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m5264(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1068 + 61;
        f1069 = i10 % 128;
        int i11 = i10 % 2;
        String strM5241 = m5241(inneractiveAdSpot);
        int i12 = f1068 + 113;
        f1069 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return strM5241;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5265(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        int i10 = f1068 + 53;
        f1069 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        inneractiveContentController.setEventsListener(eventsListener);
        if (z10) {
            int i11 = 77 / 0;
        }
        int i12 = f1068 + 15;
        f1069 = i12 % 128;
        if (!(i12 % 2 == 0)) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveAdSpot m5266(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        int i10 = f1069 + 51;
        f1068 = i10 % 128;
        int i11 = i10 % 2;
        InneractiveAdSpot inneractiveAdSpotM5251 = m5251(inneractiveAdViewUnitController);
        int i12 = f1068 + 79;
        f1069 = i12 % 128;
        int i13 = i12 % 2;
        return inneractiveAdSpotM5251;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static InneractiveContentController.EventsListener m5267(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        int i10 = f1069 + 97;
        f1068 = i10 % 128;
        char c10 = i10 % 2 != 0 ? 'A' : 'Y';
        InneractiveContentController.EventsListener eventsListener = inneractiveFullscreenVideoContentController.getEventsListener();
        if (c10 != 'Y') {
            int i11 = 1 / 0;
        }
        return eventsListener;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m5268(InneractiveUnitController inneractiveUnitController) {
        int i10 = f1069 + 31;
        f1068 = i10 % 128;
        int i11 = i10 % 2;
        Object objM5261 = m5261(inneractiveUnitController);
        int i12 = f1069 + 7;
        f1068 = i12 % 128;
        int i13 = i12 % 2;
        return objM5261;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m5269(ImpressionData impressionData) {
        int i10 = f1068 + 83;
        f1069 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 27 : 'G';
        String strM5255 = m5255(impressionData);
        if (c10 != 'G') {
            int i11 = 62 / 0;
        }
        return strM5255;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m5270(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        int i10 = f1068 + 103;
        f1069 = i10 % 128;
        int i11 = i10 % 2;
        m5265(inneractiveContentController, eventsListener);
        int i12 = f1069 + 67;
        f1068 = i12 % 128;
        if (!(i12 % 2 != 0)) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m5271(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1068 + 81;
        f1069 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM5250 = m5250(inneractiveAdSpot);
        int i12 = f1069 + 61;
        f1068 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return zM5250;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5262(TextUtils.indexOf("", "", 0, 0) + IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, (char) (ViewConfiguration.getTouchSlop() >> 8), 26 - TextUtils.getOffsetBefore("", 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bv.m5260((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m5262(1059 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (7375 - TextUtils.getOffsetAfter("", 0)), KeyEvent.getDeadChar(0, 0) + 9).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bv.m5256((InneractiveAdRequest) list.get(0));
            }
        });
        map.put(m5262(1068 - TextUtils.getTrimmedLength(""), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 13 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bv.m5254((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m5262(KeyEvent.getDeadChar(0, 0) + 1080, (char) (12235 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 13 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return Boolean.valueOf(bv.m5259((InneractiveAdSpot) list.get(0)));
            }
        });
        map.put(m5262((ViewConfiguration.getPressedStateDuration() >> 16) + 1094, (char) (ExpandableListView.getPackedPositionChild(0L) + 49914), View.MeasureSpec.makeMeasureSpec(0, 0) + 9).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return Boolean.valueOf(bv.m5271((InneractiveAdSpot) list.get(0)));
            }
        });
        map.put(m5262(TextUtils.getOffsetAfter("", 0) + 1103, (char) (12781 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 18 - Color.blue(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bv.m5264((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m5262(TextUtils.indexOf("", "") + 1121, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 9).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bv.m5258((InneractiveFullscreenAdActivity) list.get(0));
            }
        });
        map.put(m5262(1129 - TextUtils.lastIndexOf("", '0'), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 44615), 24 - TextUtils.lastIndexOf("", '0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bv.m5249((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m5262(TextUtils.getOffsetAfter("", 0) + 1155, (char) (19859 - View.getDefaultSize(0, 0)), Gravity.getAbsoluteGravity(0, 0) + 28).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bv.m5268((InneractiveUnitController) list.get(0));
            }
        });
        map.put(m5262(1183 - Color.argb(0, 0, 0, 0), (char) (Process.getGidForName("") + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 17).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bv.m5252((InneractiveFullscreenVideoContentController) list.get(0));
            }
        });
        map.put(m5262(1200 - View.MeasureSpec.getMode(0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bv.m5270((InneractiveContentController) list.get(0), (VideoContentListener) list.get(1));
                return null;
            }
        });
        map.put(m5262(Color.rgb(0, 0, 0) + 16778433, (char) (12150 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), '9' - AndroidCharacter.getMirror('0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bv.m5266((InneractiveAdViewUnitController) list.get(0));
            }
        });
        map.put(m5262(((byte) KeyEvent.getModifierMetaStateMask()) + 1227, (char) (Color.green(0) + 50743), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bv.m5257((String) list.get(0));
            }
        });
        map.put(m5262(1248 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 20 - Drawable.resolveOpacity(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return Integer.valueOf(bv.m5243());
            }
        });
        map.put(m5262(1316 - AndroidCharacter.getMirror('0'), (char) ((-16729276) - Color.rgb(0, 0, 0)), 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bv.m5269((ImpressionData) list.get(0));
            }
        });
        int i10 = f1068 + 43;
        f1069 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 25 : '?') == '?') {
            return map;
        }
        int i11 = 69 / 0;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        int i10 = f1068 + 75;
        f1069 = i10 % 128;
        if (i10 % 2 != 0) {
            return InneractiveAdManager.getVersion();
        }
        InneractiveAdManager.getVersion();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x011f  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 1924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bv.mo4814(java.lang.String):java.lang.Class");
    }
}
