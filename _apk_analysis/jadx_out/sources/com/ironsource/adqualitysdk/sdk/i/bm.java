package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBFetchFactory;
import com.amazon.device.ads.DTBFetchManager;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class bm extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f902 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f903;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f904;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f905;

    public class a extends HashMap<String, DTBFetchManager> implements hg<HashMap<String, DTBFetchManager>> {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f929 = 1;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f930 = {'D', 'T', 'B', 'F', 'e', 't', 'c', 'h', 'M', 'a', 'n', 'g', 'r', 'k', 'H', 's', 'p', '.', 'u', 'E', 'G', 'I', 'J', 'K', 'L'};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f931 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f932 = 5;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ch f934;

        public a(HashMap<String, DTBFetchManager> map, ch chVar) {
            super(map);
            this.f934 = chVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private DTBFetchManager m5066(String str, DTBFetchManager dTBFetchManager) {
            int i10 = f931 + 89;
            f929 = i10 % 128;
            int i11 = i10 % 2;
            bm.this.m4894(this, this.f934, m5068("\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000e\u0005\u000e\u0001\r\u000e\u0013\u000e\u0011\u0005\t\u0005\u0011\u0012\u0011\u0013¸", 28 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (68 - ExpandableListView.getPackedPositionType(0L))).intern(), str, dTBFetchManager);
            DTBFetchManager dTBFetchManager2 = (DTBFetchManager) super.put(str, dTBFetchManager);
            int i12 = f929 + 63;
            f931 = i12 % 128;
            if ((i12 % 2 != 0 ? 'B' : ' ') == ' ') {
                return dTBFetchManager2;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private HashMap<String, DTBFetchManager> m5067() {
            int i10 = f929;
            int i11 = i10 + 111;
            f931 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i10 + 57;
            f931 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m5068(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2151) {
                char[] cArr2 = f930;
                char c10 = f932;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    g.f2156 = 0;
                    while (true) {
                        int i11 = g.f2156;
                        if (i11 >= i10) {
                            break;
                        }
                        g.f2155 = cArr[i11];
                        g.f2153 = cArr[g.f2156 + 1];
                        if (g.f2155 == g.f2153) {
                            cArr3[g.f2156] = (char) (g.f2155 - b10);
                            cArr3[g.f2156 + 1] = (char) (g.f2153 - b10);
                        } else {
                            g.f2154 = g.f2155 / c10;
                            g.f2152 = g.f2155 % c10;
                            g.f2157 = g.f2153 / c10;
                            g.f2150 = g.f2153 % c10;
                            if (g.f2152 == g.f2150) {
                                g.f2154 = ((g.f2154 + c10) - 1) % c10;
                                g.f2157 = ((g.f2157 + c10) - 1) % c10;
                                int i12 = (g.f2154 * c10) + g.f2152;
                                int i13 = (g.f2157 * c10) + g.f2150;
                                int i14 = g.f2156;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (g.f2154 == g.f2157) {
                                g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                g.f2150 = ((g.f2150 + c10) - 1) % c10;
                                int i15 = (g.f2154 * c10) + g.f2152;
                                int i16 = (g.f2157 * c10) + g.f2150;
                                int i17 = g.f2156;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (g.f2154 * c10) + g.f2150;
                                int i19 = (g.f2157 * c10) + g.f2152;
                                int i20 = g.f2156;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        g.f2156 += 2;
                    }
                }
                str2 = new String(cArr3);
            }
            return str2;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            int i10 = f929 + 19;
            f931 = i10 % 128;
            int i11 = i10 % 2;
            DTBFetchManager dTBFetchManagerM5066 = m5066((String) obj, (DTBFetchManager) obj2);
            int i12 = f929 + 79;
            f931 = i12 % 128;
            int i13 = i12 % 2;
            return dTBFetchManagerM5066;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ HashMap<String, DTBFetchManager> mo4818() {
            int i10 = f929 + 91;
            f931 = i10 % 128;
            int i11 = i10 % 2;
            HashMap<String, DTBFetchManager> mapM5067 = m5067();
            int i12 = f931 + 121;
            f929 = i12 % 128;
            int i13 = i12 % 2;
            return mapM5067;
        }
    }

    public class c extends ThreadPoolExecutor implements hg<ThreadPoolExecutor> {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f935 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f936;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f937 = {'T', 37814, 10157, 48036, 20405, 58279, 30669, 3032, 40911, 13286, 51163, 23321, 61186, 33554, 5937, 43823, 16165, 54042, 26445, 64356, 36725, 9063, 46733, 19096, 56965};

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f938 = 3708850498202801140L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private ch f940;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(ThreadPoolExecutor threadPoolExecutor, ch chVar) {
            int corePoolSize = threadPoolExecutor.getCorePoolSize();
            int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            super(corePoolSize, maximumPoolSize, threadPoolExecutor.getKeepAliveTime(timeUnit), timeUnit, threadPoolExecutor.getQueue());
            this.f940 = chVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m5069(int i10, char c10, int i11) {
            String str;
            synchronized (d.f1675) {
                char[] cArr = new char[i11];
                d.f1674 = 0;
                while (true) {
                    int i12 = d.f1674;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f937[i10 + i12]) ^ (((long) i12) * f938)) ^ ((long) c10));
                        d.f1674 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            }
            return str;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private ThreadPoolExecutor m5070() {
            int i10 = f936 + 125;
            f935 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 59 / 0;
            }
            return this;
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            int i10 = f935 + 111;
            f936 = i10 % 128;
            int i11 = i10 % 2;
            bm.this.m4894(this, this.f940, m5069(Process.myPid() >> 22, (char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "", 0) + 25).intern(), runnable);
            super.execute(runnable);
            int i12 = f935 + 79;
            f936 = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ ThreadPoolExecutor mo4818() {
            int i10 = f935 + 9;
            f936 = i10 % 128;
            int i11 = i10 % 2;
            ThreadPoolExecutor threadPoolExecutorM5070 = m5070();
            int i12 = f935 + 23;
            f936 = i12 % 128;
            int i13 = i12 % 2;
            return threadPoolExecutorM5070;
        }
    }

    static {
        char[] cArr = new char[1191];
        ByteBuffer.wrap("\u0000.\u0085Õ\u000bÓ\u0091Õ\u0017§\u009d§#\u009e©×/¥µÜ;ßÁÛGÞ\u000f`\u008aº\u0004\u008d\u009e¹\u0018º\u0092³,¨¦¬ «º·4£Î½HºÂ¼\u0000D\u0085«\u000b¼\u0091¼\u0017\u009f\u009d\u008f#\u0093©\u008f/\u0091µ\u0083;\u008f\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0091G\u0091Í\u0085S\u009bÙ\u0092_\u0095åÁk\u008fñ\u0089w\u009fýÅ\u0083®\t½\u008fª\u0015¦\u009b\u0085!\u0091§\u008d-\u0095³\u008b9\u0095¿\u0099\u0000D\u0085«\u000b¼\u0091´\u0017\u0092\u009d\u008f#\u009f©\u008b/\u008bµ\u0083;\u009fÁ\u0081G\u009dÍ\u0092S\u009eÙ°_\u0093å\u009bk\u0087ñ\u009bw\u0085ý\u009f\u0083\u0093\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0091G\u0091Í\u0085S\u009bÙ\u0092_\u0095åÁk\u008fñ\u0089w\u009fýÅ\u0083®\t½\u008fª\u0015®\u009b\u0088!\u0091§\u0081-\u0091³\u00919\u0095¿\u0089E«Ë·Q¼×°]\u009aã¹i\u00adï±u¡û¿\u0081¡\u0007\u00ad\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009dº#\u0099©\u008d/\u0091µ\u0081;\u009fÁ\u0081G\u008d\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0091G\u0091Í\u0085S\u009bÙ\u0092_\u0095åÁk\u008fñ\u0089w\u009fýÅ\u0083®\t½\u008fª\u0015¦\u009b\u0082!¤§\u0087-\u0097³\u008b9\u0097¿\u0089E«Ë§\u0088\u0007\rè\u0083ÿ\u0019ÿ\u009fÛ\u0015ñ«×!Î§Þ=Æ³ÆIÂÏÞEÄÛØQÓ×ß\u0000Y\u0085¶\u000b¡\u0091¡\u0017\u0085\u009dª#\u0088©\u0085/\u0081µ\u008f;\u0099\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d©#\u009f©\u0088/\u008dµ\u0092;\u0085Á\u0081ºÖ?9±.+.\u00ad\n';\u0099\r\u0013\u0018\u0095\u001a\u000f\n\u0081\n{\u0014ý\u0003Z\u0018ß÷QàËàMÄÇñyÏóÀuÓ\u0080]\u0005®\u008b\u00ad\u0011í\u0097£\u001d¨£¥)½¯©5§»æA¯Ç¯M»Ó¥Y¬ß«eÿë±q·÷¡}û\u0003\u0090\u0089\u0083\u000f\u0094\u0095\u0098\u001b¼¡\u008d'³\u00ad¸3«^-ÛÂUÕÏÕIñÃÁ}ú÷êqô\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d\u00ad#\u0093©\u009c/\u008fµ¤;\u0083Á\u0085G\u0084Í\u009cS\u0080Ù\u0085_³å\u0083k\u0087ñ\u0088w\u0082ý\u009fÇhB\u0087Ì\u0090V\u0097ÐµZ£äµn½è\u0092rºü¹\u0006\u00ad\u0080·\n\u00ad\u0094§\u009dé\u0018\u0006\u0096\u0011\f\u0016\u008a4\u0000\"¾44<²\u0018(;¦5\\9Ú>P;Î-jWï¸a¯û¼}\u008a÷\u0086I\u008dÃ\u008fE\u0099ß\u0081Q\u0097\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d¹#\u009b©\u0097/\u0096µ\u0092;\u0084Á¹G\u009dÍ\u0080S\u0086Ù\u0094_\u009eå\u008ak\u009c´Y1¶¿¡%¡£\u0085)¤\u0097\u0086\u001d\u0097\u009b\u0080\u0001¨\u008f\u008au\u0086ó\u0087y\u008bç\u009dm ë\u0084Q\u0081ß\u0087E\u0095Ã\u009fI\u00937\u0085\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d¹#\u009b©\u008a/\u009dµ¾;\u0098Á\u0081G\u0091Í\u0081S\u0081Ù\u0085_\u0099å\u009bk\u0087ñ\u008cw\u0080ý§\u0083\u0083\t\u009a\u008f\u009c\u0015\u0082\u009b\u0088!\u0080§\u0096Ù\u0092\\}ÒjHjÎNDnúMpCöBlCâA\u0018@\u009eIÄìA\u0003Ï\u0014U\u0014Ó0Y\u0016ç*m!ë1q1ÿ:\u00058\u00838\t\u0017\u00973\u001d*\u009b,!\"¯(5 ³6\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d²#\u0094©\u008d/\u009dµ\u0085;\u0085Á\u0081G\u009dÍ\u0087S\u009bÙ\u0090_\u009cå£k\u0087ñ\u009ew\u0098ý\u008e\u0083\u0084\t\u008c\u008f\u009au\u0080ðo~xäxb\\èsVWÜNZHÀVN\\´T2B\u0000T\u0085½\u000b³\u0091\u009c\u0017\u0092\u009d\u009a#\u009d©\u009c/\u008aµ¿;\u0097Á\u0086G\u009cÍ¾S\u0093Ù\u0081\u0000T\u0085½\u000b»\u0091\u0085\u0017\u0099\u009d\u0098#\u008f©\u008d/\u0097µ\u0085;¥Á\u0090G\u0086Í\u0085S\u009bÙ\u0092_\u0095dÃá\ro\u000fõ6s\u0010ù\rG\u001dÍ\tK\tÑ\u0001_\u001d¥\u0003#\u001f©\u00107\u001c½2;\u0011\u0081\u0019\u000f\u0005\u0095\u0019\u0013\u0007\u0099\u001dç\u0011\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0094G\u0084Í\u0080SÜÙ\u0090_\u0094å\u009ckÀñ\u008cw\u008fý\u009f\u0083\u0083\t\u009f\u008f\u0081\u0015\u0093\u009b\u009f!Ë§¥-\u0093³\u00919¨¿\u008eE«Ë»Q¯×¯]¯ã³i\u00adï±u¶ûº\u0081\u0094\u0007·\u008d§\u0013»\u0099§\u001f¹¥»+·Æ5CûÍùWÈÑì[Îåíoùéåsõýë\u0007õ\u0081ù9\r¼þ2ý¨½.ó¤ø\u001aõ\u0090í\u0016ù\u008c÷\u0002¶øú~êôîj²àþfúÜòR®ÈâNáÄñºí0ñ¶ï,ý¢ñ\u0018¥\u009eË\u0014ý\u008aÿ\u0000Î\u0086ê|ðòÓhÇîÛdÃÚÝPÃÖÏÑ\nTÄÚÆ@÷ÆÓLæòØx×þÄ\u0093ó\u0016=\u0098?\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d¸#\u0095©\u0097/\u008cµ\u0085;\u0099Á\u0099G\u0098Í\u0096S\u0080\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d·#\u0093©\u008a/\u008cµ\u0092;\u0098Á\u0090G\u0086\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d©#\u009f©\u0088/\u008dµ\u0092;\u0085Á\u0081G¸Í\u009aS\u0081Ù\u0085_\u0095å\u0081k\u008bñ\u009f\u0094q\u0011¿\u009f½\u0005\u008c\u0083¨\t\u008d·¥=»»¥!¦¯²\"Å§\u000b)\t³85\u001c¿+\u0001\u0007\u008b\r\r\u0019\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d©#\u009f©\u0088/\u008dµ\u0092;\u0085Á\u00810\u009bµf;v¡@'p\u00adw\u0013M\u0099`\u001f} +%Ö«Æ1÷·Õ=Ã\u0083Õ\tÝ\u008fò\u0015Ú\u009bÙaÍç×mÍóÇyôÿÒEÐËÖQÀ×Î]Ä#Ã\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d©#\u009f©\u008a/\u0088µ\u0098;\u0098Á\u0086G\u0091Í±S\u009bÙ\u0095_¹å\u008b,\u009c©a'q½G;c±R\u000fd\u0085q\u0003s\u0099c\u0017cí}kjáK\u007f{õosjÉ`G|Ý`[rÑY¯u\u009a±\u001fL\u0091\\\u000bj\u008dN\u0007\u007f¹I3\\µ^/N¡N[PÝGWlÉICWÅT\u007f\\ñKkHíSgR\u0019R\u0093j\u0015L\u008f]\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d©#\u009f©\u008a/\u0088µ\u0098;\u0098Á\u0086G\u0091Í¡S\u0097Ù\u009f_\u0094å\u008ak\u009cñ\u0084w\u0082ý\u008c\u0083§\t\u0088\u008f\u0098a\u009fäbjrðDv`üQBgÈrNpÔ`Z` ~&i¬Y2o¸g>l\u0084r\nd\u0090|\u0016z\u009ctâPhdî~t{úr@xh\"íßcÏùü\u007fÜõØKÞÁÉGÑÝÆSå©Ù/Õ¥Ó;Ø±õ7Ñ\u008dÙ\u0003ù\u0099Í\u001fØ\u0095ÛëÊaßçÙ}áóÖIÓÏÕEÉÛÊQô×Ä-è£ú9õ¿êÉ2LÏÂßXéÞÍTüêÊ`ßæÝ|ÍòÍ\bÓ\u008eÄ\u0004ç\u009aÃ\u0010×\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d©#\u009f©\u008a/\u0088µ\u0098;\u0098Á\u0086G\u0091Í£S\u0080Ù\u0098_\u0093å\u008ak¾ñ\u0082w\u0085ý\u0085\u0083\u009e ñ%\f«\u001c1*·\u000e=>\u0083\u0005\t\u0015\u008f\u000b\u00152\u009b\fa\fç\u0016m0ó1y.ÿ\"U\u0004Ðù^éÄßBûÈËvðüàzþàÕnñ\u0094Â\u0012î\u0098à\u0006ô¬H)µ§¥=\u0093»·1\u0087\u008f¼\u0005¬\u0083²\u0019\u0088\u0097¬m¸ë\u0088a¹ÿ©uªó¶I®Ç¦]±\u0000i\u0085\u008c\u000b¿\u0091\u0099\u0017¯\u009d\u0092#\u0080©\u009c/±µ\u0099;\u0082Á\u0090G\u0086Í\u0080S\u0086Ù\u0098_\u0084å\u0086k\u008fñ\u0081w\u00adý\u008f\u009eÚ\u001b4\u0095\"\u000f%\u00891\u0003'½\u00177\u0002±\u0007++¥;_/Ù%S\fÍ*G+Á={9õ%o-é\u0018c3\u001d=\u00971\u00116\u008b;\u0005-¿\u00119<³*a\u009eäpjfðavuücBSÈFN@ÔrZn k&|¬z2`¸~>^\u0084w\na\u0090f\u0016x\u009cuâr\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u008c\u009d\u0088#»©\u009d/ªµ\u0092;\u0087Á\u0080G\u0091Í\u0080S\u0086É\u0080L}ÂmXXÞrTxêT`pæy|\u007f^¹ÛDUTÏsIPÃL}G÷BqvëFeA\u009fE\u0019^\u0000g\u0085\u009a\u000b\u008a\u0091®\u0017\u0090\u009d\u0094#\u008e©¬/\u008dµ\u009e;\u0092\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u008c\u009d\u0088#»©\u009d/¾µ\u0098;\u0084Á\u0098G\u0095Í\u0087\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d·#\u0095©\u0098/\u009cµ\u0092;\u0084þF{»õ«o\u009dé¹c\u008cÝ²W½Ñ®".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1191);
        f904 = cArr;
        f905 = 1286376246626059775L;
    }

    public bm(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static String m5019(ApsAd apsAd) {
        int i10 = f902 + 91;
        f903 = i10 % 128;
        if (i10 % 2 == 0) {
            return apsAd.getSlotUuid();
        }
        apsAd.getSlotUuid();
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static Map<String, String> m5020(DTBAdResponse dTBAdResponse) {
        int i10 = f902 + 9;
        f903 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, String> defaultVideoAdsRequestCustomParams = dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
        int i12 = f902 + 99;
        f903 = i12 % 128;
        if ((i12 % 2 != 0 ? '*' : (char) 17) != '*') {
            return defaultVideoAdsRequestCustomParams;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static ApsAdFormat m5021(ApsAd apsAd) {
        int i10 = f903 + 107;
        f902 = i10 % 128;
        int i11 = i10 % 2;
        ApsAdFormat apsAdFormat = apsAd.getApsAdFormat();
        int i12 = f903 + 41;
        f902 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 14 : '%') == '%') {
            return apsAdFormat;
        }
        int i13 = 23 / 0;
        return apsAdFormat;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m5022() {
        int i10 = f902 + 9;
        f903 = i10 % 128;
        int i11 = i10 % 2;
        String appKey = AdRegistration.getAppKey();
        int i12 = f903 + 63;
        f902 = i12 % 128;
        int i13 = i12 % 2;
        return appKey;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static HashMap<String, Object> m5023(DTBAdResponse dTBAdResponse) {
        int i10 = f903 + 119;
        f902 = i10 % 128;
        int i11 = i10 % 2;
        HashMap<String, Object> renderingMap = dTBAdResponse.getRenderingMap();
        int i12 = f902 + 9;
        f903 = i12 % 128;
        int i13 = i12 % 2;
        return renderingMap;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static Bundle m5024(DTBAdResponse dTBAdResponse) {
        int i10 = f902 + 69;
        f903 = i10 % 128;
        if (i10 % 2 == 0) {
            return dTBAdResponse.getRenderingBundle();
        }
        dTBAdResponse.getRenderingBundle();
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static DTBAdView m5025(ApsAd apsAd) {
        int i10 = f903 + 35;
        f902 = i10 % 128;
        if ((i10 % 2 == 0 ? '=' : 'T') != '=') {
            return apsAd.getAdView();
        }
        apsAd.getAdView();
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static DTBFetchFactory m5026() {
        int i10 = f902 + 3;
        f903 = i10 % 128;
        int i11 = i10 % 2;
        DTBFetchFactory dTBFetchFactory = DTBFetchFactory.getInstance();
        int i12 = f903 + 21;
        f902 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 5 : '(') != 5) {
            return dTBFetchFactory;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static ApsAdRequest m5027(ApsAd apsAd) {
        int i10 = f902 + 1;
        f903 = i10 % 128;
        int i11 = i10 % 2;
        ApsAdRequest adLoader = apsAd.getAdLoader();
        int i12 = f902 + 53;
        f903 = i12 % 128;
        int i13 = i12 % 2;
        return adLoader;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static List<DTBAdSize> m5028(DTBAdResponse dTBAdResponse) {
        int i10 = f902 + 61;
        f903 = i10 % 128;
        if ((i10 % 2 != 0 ? 'c' : 'H') == 'c') {
            dTBAdResponse.getDTBAds();
            throw null;
        }
        List<DTBAdSize> dTBAds = dTBAdResponse.getDTBAds();
        int i11 = f903 + 1;
        f902 = i11 % 128;
        if ((i11 % 2 != 0 ? '`' : 'c') == '`') {
            return dTBAds;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ DTBAdView m5029(ApsAd apsAd) {
        int i10 = f902 + 67;
        f903 = i10 % 128;
        if ((i10 % 2 != 0 ? ',' : (char) 14) != ',') {
            return m5025(apsAd);
        }
        m5025(apsAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m5030() {
        int i10 = f902 + 7;
        f903 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 25 : 'Z') == 'Z') {
            return m5022();
        }
        m5022();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m5031(DTBAdResponse dTBAdResponse) {
        int i10 = f902 + 99;
        f903 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            dTBAdResponse.getImpressionUrl();
            throw null;
        }
        String impressionUrl = dTBAdResponse.getImpressionUrl();
        int i11 = f902 + 63;
        f903 = i11 % 128;
        if (i11 % 2 == 0) {
            return impressionUrl;
        }
        int i12 = 92 / 0;
        return impressionUrl;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ ApsAdRequest m5032(ApsAd apsAd) {
        int i10 = f903 + 125;
        f902 = i10 % 128;
        int i11 = i10 % 2;
        ApsAdRequest apsAdRequestM5027 = m5027(apsAd);
        int i12 = f903 + 17;
        f902 = i12 % 128;
        int i13 = i12 % 2;
        return apsAdRequestM5027;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ DTBFetchFactory m5033() {
        int i10 = f902 + 81;
        f903 = i10 % 128;
        int i11 = i10 % 2;
        DTBFetchFactory dTBFetchFactoryM5026 = m5026();
        int i12 = f902 + 27;
        f903 = i12 % 128;
        int i13 = i12 % 2;
        return dTBFetchFactoryM5026;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m5034(DTBAdResponse dTBAdResponse) {
        int i10 = f903 + 17;
        f902 = i10 % 128;
        int i11 = i10 % 2;
        String bidId = dTBAdResponse.getBidId();
        int i12 = f903 + 13;
        f902 = i12 % 128;
        int i13 = i12 % 2;
        return bidId;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean m5035(DTBAdSize dTBAdSize) {
        int i10 = f903 + 125;
        f902 = i10 % 128;
        int i11 = i10 % 2;
        boolean zIsInterstitialAd = dTBAdSize.isInterstitialAd();
        int i12 = f902 + 71;
        f903 = i12 % 128;
        if ((i12 % 2 != 0 ? 'I' : 'J') == 'J') {
            return zIsInterstitialAd;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m5036(ApsAd apsAd) {
        int i10 = f903 + 113;
        f902 = i10 % 128;
        int i11 = i10 % 2;
        String pricePoint = apsAd.getPricePoint();
        int i12 = f902 + 11;
        f903 = i12 % 128;
        int i13 = i12 % 2;
        return pricePoint;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m5037(DTBAdResponse dTBAdResponse) {
        int i10 = f903 + 39;
        f902 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String crid = dTBAdResponse.getCrid();
        if (!z10) {
            int i11 = 55 / 0;
        }
        int i12 = f902 + 43;
        f903 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return crid;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static JSONObject m5038(DTBAdSize dTBAdSize) {
        int i10 = f902 + 57;
        f903 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject pubSettings = dTBAdSize.getPubSettings();
        int i12 = f903 + 87;
        f902 = i12 % 128;
        int i13 = i12 % 2;
        return pubSettings;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m5039(ApsAd apsAd) {
        int i10 = f902 + 77;
        f903 = i10 % 128;
        int i11 = i10 % 2;
        String bidInfo = apsAd.getBidInfo();
        int i12 = f902 + 25;
        f903 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return bidInfo;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ List m5040(DTBAdResponse dTBAdResponse) {
        int i10 = f902 + 1;
        f903 = i10 % 128;
        int i11 = i10 % 2;
        List<DTBAdSize> listM5028 = m5028(dTBAdResponse);
        int i12 = f902 + 39;
        f903 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return listM5028;
        }
        int i13 = 39 / 0;
        return listM5028;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static ApsAdRequest m5041(ApsAd apsAd) {
        int i10 = f902 + 71;
        f903 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '@' : '^';
        ApsAdRequest apsAdRequest = apsAd.getApsAdRequest();
        if (c10 != '^') {
            int i11 = 38 / 0;
        }
        int i12 = f903 + 17;
        f902 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return apsAdRequest;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static AdType m5042(DTBAdSize dTBAdSize) {
        int i10 = f903 + 71;
        f902 = i10 % 128;
        int i11 = i10 % 2;
        AdType dTBAdType = dTBAdSize.getDTBAdType();
        int i12 = f902 + 31;
        f903 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 2 : 'C') != 2) {
            return dTBAdType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ Map m5043(DTBAdResponse dTBAdResponse) {
        int i10 = f902 + 107;
        f903 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, String> mapM5020 = m5020(dTBAdResponse);
        int i12 = f903 + 29;
        f902 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 23 : (char) 19) != 23) {
            return mapM5020;
        }
        int i13 = 35 / 0;
        return mapM5020;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ ApsAdFormat m5044(ApsAd apsAd) {
        int i10 = f902 + 7;
        f903 = i10 % 128;
        int i11 = i10 % 2;
        ApsAdFormat apsAdFormatM5021 = m5021(apsAd);
        int i12 = f902 + 5;
        f903 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return apsAdFormatM5021;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AdType m5045(DTBAdSize dTBAdSize) {
        int i10 = f903 + 125;
        f902 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '>' : '\\';
        AdType adTypeM5042 = m5042(dTBAdSize);
        if (c10 != '\\') {
            int i11 = 8 / 0;
        }
        return adTypeM5042;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ HashMap m5046(DTBAdResponse dTBAdResponse) {
        int i10 = f902 + 9;
        f903 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '$' : '\r';
        HashMap<String, Object> mapM5023 = m5023(dTBAdResponse);
        if (c10 == '$') {
            int i11 = 54 / 0;
        }
        return mapM5023;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m5047(ApsAd apsAd) {
        int i10 = f903 + 107;
        f902 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'Z' : (char) 20;
        String strM5036 = m5036(apsAd);
        if (c10 == 'Z') {
            int i11 = 47 / 0;
        }
        return strM5036;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m5048(DTBAdResponse dTBAdResponse) {
        int i10 = f903 + 45;
        f902 = i10 % 128;
        int i11 = i10 % 2;
        String strM5034 = m5034(dTBAdResponse);
        int i12 = f902 + 19;
        f903 = i12 % 128;
        if ((i12 % 2 != 0 ? 'H' : 'X') == 'X') {
            return strM5034;
        }
        int i13 = 5 / 0;
        return strM5034;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m5049(DTBAdSize dTBAdSize) {
        int i10 = f903 + 55;
        f902 = i10 % 128;
        int i11 = i10 % 2;
        String strM5065 = m5065(dTBAdSize);
        int i12 = f902 + 79;
        f903 = i12 % 128;
        int i13 = i12 % 2;
        return strM5065;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ ApsAdRequest m5050(ApsAd apsAd) {
        int i10 = f902 + 53;
        f903 = i10 % 128;
        int i11 = i10 % 2;
        ApsAdRequest apsAdRequestM5041 = m5041(apsAd);
        int i12 = f902 + 15;
        f903 = i12 % 128;
        int i13 = i12 % 2;
        return apsAdRequestM5041;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m5051(DTBAdResponse dTBAdResponse) {
        int i10 = f902 + 73;
        f903 = i10 % 128;
        int i11 = i10 % 2;
        String strM5037 = m5037(dTBAdResponse);
        int i12 = f903 + 17;
        f902 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return strM5037;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5052(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        int i10 = f903 + 1;
        f902 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        String pricePoints = dTBAdResponse.getPricePoints(dTBAdSize);
        if (z10) {
            int i11 = 10 / 0;
        }
        int i12 = f903 + 21;
        f902 = i12 % 128;
        if (i12 % 2 != 0) {
            return pricePoints;
        }
        int i13 = 37 / 0;
        return pricePoints;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m5053(DTBAdSize dTBAdSize) {
        int i10 = f903 + 119;
        f902 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return m5035(dTBAdSize);
        }
        m5035(dTBAdSize);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Bundle m5054(DTBAdResponse dTBAdResponse) {
        int i10 = f902 + 37;
        f903 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        Bundle bundleM5024 = m5024(dTBAdResponse);
        if (z10) {
            int i11 = 34 / 0;
        }
        return bundleM5024;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private a m5055(HashMap<String, DTBFetchManager> map, ch chVar) {
        a aVar = new a(map, chVar);
        int i10 = f903 + 65;
        f902 = i10 % 128;
        int i11 = i10 % 2;
        return aVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5056(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f904[i10 + i12]) ^ (((long) i12) * f905)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m5057(ApsAd apsAd) {
        int i10 = f903 + 99;
        f902 = i10 % 128;
        int i11 = i10 % 2;
        String strM5039 = m5039(apsAd);
        int i12 = f903 + 3;
        f902 = i12 % 128;
        if (i12 % 2 != 0) {
            return strM5039;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m5058(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        int i10 = f902 + 117;
        f903 = i10 % 128;
        int i11 = i10 % 2;
        String strM5052 = m5052(dTBAdResponse, dTBAdSize);
        int i12 = f903 + 95;
        f902 = i12 % 128;
        int i13 = i12 % 2;
        return strM5052;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m5059(DTBAdSize dTBAdSize) {
        int i10 = f903 + 125;
        f902 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return m5038(dTBAdSize);
        }
        m5038(dTBAdSize);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ a m5060(bm bmVar, HashMap map, ch chVar) {
        int i10 = f902 + 115;
        f903 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        a aVarM5055 = bmVar.m5055((HashMap<String, DTBFetchManager>) map, chVar);
        if (z10) {
            int i11 = 77 / 0;
        }
        int i12 = f903 + 27;
        f902 = i12 % 128;
        int i13 = i12 % 2;
        return aVarM5055;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ c m5061(bm bmVar, ThreadPoolExecutor threadPoolExecutor, ch chVar) {
        int i10 = f902 + 9;
        f903 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 23 : 'R') != 23) {
            return bmVar.m5062(threadPoolExecutor, chVar);
        }
        bmVar.m5062(threadPoolExecutor, chVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private c m5062(ThreadPoolExecutor threadPoolExecutor, ch chVar) {
        c cVar = new c(threadPoolExecutor, chVar);
        int i10 = f903 + 105;
        f902 = i10 % 128;
        int i11 = i10 % 2;
        return cVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m5063(ApsAd apsAd) {
        int i10 = f903 + 33;
        f902 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return m5019(apsAd);
        }
        m5019(apsAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m5064(DTBAdResponse dTBAdResponse) {
        int i10 = f902 + 81;
        f903 = i10 % 128;
        int i11 = i10 % 2;
        String strM5031 = m5031(dTBAdResponse);
        int i12 = f903 + 3;
        f902 = i12 % 128;
        int i13 = i12 % 2;
        return strM5031;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5065(DTBAdSize dTBAdSize) {
        int i10 = f902 + 95;
        f903 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            dTBAdSize.getSlotUUID();
            throw null;
        }
        String slotUUID = dTBAdSize.getSlotUUID();
        int i11 = f902 + 25;
        f903 = i11 % 128;
        if ((i11 % 2 != 0 ? '\t' : '<') == '<') {
            return slotUUID;
        }
        int i12 = 4 / 0;
        return slotUUID;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5056((ViewConfiguration.getKeyRepeatDelay() >> 16) + 753, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 12540), 9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5030();
            }
        });
        map.put(m5056(762 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (41036 - (KeyEvent.getMaxKeyCode() >> 16)), 24 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5033();
            }
        });
        map.put(m5056(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 786, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5048((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5056(803 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (11515 - View.MeasureSpec.getMode(0)), 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5051((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5056(826 - Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 39638), View.MeasureSpec.getSize(0) + 26).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5064((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5056((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 851, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.resolveSize(0, 0) + 25).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5046((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5056(876 - TextUtils.lastIndexOf("", '0'), (char) (TextUtils.indexOf("", "", 0, 0) + 25080), 27 - TextUtils.lastIndexOf("", '0', 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.23
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5054((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5056(905 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (26693 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 37 - ExpandableListView.getPackedPositionType(0L)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.22
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5043((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5056((ViewConfiguration.getWindowTouchSlop() >> 8) + 942, (char) (TextUtils.indexOf((CharSequence) "", '0') + 51542), 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.21
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5040((DTBAdResponse) list.get(0));
            }
        });
        map.put(m5056(959 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), Color.alpha(0) + 23).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5058((DTBAdResponse) list.get(0), (DTBAdSize) list.get(1));
            }
        });
        map.put(m5056(KeyEvent.keyCodeFromString("") + 981, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 41110), Drawable.resolveOpacity(0, 0) + 17).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5049((DTBAdSize) list.get(0));
            }
        });
        map.put(m5056(999 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (21859 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5045((DTBAdSize) list.get(0));
            }
        });
        map.put(m5056(1013 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (44079 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 20).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5059((DTBAdSize) list.get(0));
            }
        });
        map.put(m5056((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1032, (char) (Process.myPid() >> 22), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return Boolean.valueOf(bm.m5053((DTBAdSize) list.get(0)));
            }
        });
        map.put(m5056(Process.getGidForName("") + IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, (char) (40633 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5060(bm.this, (HashMap) list.get(0), chVar);
            }
        });
        map.put(m5056(TextUtils.lastIndexOf("", '0') + 1086, (char) (TextUtils.indexOf("", "", 0) + 25085), 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5061(bm.this, (ThreadPoolExecutor) list.get(0), chVar);
            }
        });
        map.put(m5056(1108 - Drawable.resolveOpacity(0, 0), (char) Color.red(0), 14 - TextUtils.indexOf((CharSequence) "", '0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5050((ApsAd) list.get(0));
            }
        });
        map.put(m5056((ViewConfiguration.getTouchSlop() >> 8) + 1123, (char) (51687 - View.combineMeasuredStates(0, 0)), 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5057((ApsAd) list.get(0));
            }
        });
        map.put(m5056(1133 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (24286 - ExpandableListView.getPackedPositionType(0L)), ((Process.getThreadPriority(0) + 20) >> 6) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5047((ApsAd) list.get(0));
            }
        });
        map.put(m5056(1146 - Color.blue(0), (char) View.combineMeasuredStates(0, 0), 11 - TextUtils.indexOf("", "")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5063((ApsAd) list.get(0));
            }
        });
        map.put(m5056((ViewConfiguration.getTouchSlop() >> 8) + 1157, (char) ((-1) - MotionEvent.axisFromString("")), 13 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5044((ApsAd) list.get(0));
            }
        });
        map.put(m5056(1171 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5032((ApsAd) list.get(0));
            }
        });
        map.put(m5056(View.getDefaultSize(0, 0) + 1182, (char) (65058 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bm.m5029((ApsAd) list.get(0));
            }
        });
        int i10 = f902 + 13;
        f903 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        Matcher matcher = Pattern.compile(m5056(Color.red(0), (char) Color.red(0), (-16777203) - Color.rgb(0, 0, 0)).intern()).matcher(mo4895());
        if (!matcher.matches()) {
            return null;
        }
        int i10 = f902 + 21;
        f903 = i10 % 128;
        String strGroup = !(i10 % 2 == 0) ? matcher.group(0) : matcher.group(1);
        int i11 = f903 + 59;
        f902 = i11 % 128;
        if (i11 % 2 != 0) {
            return strGroup;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0706  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 2152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bm.mo4814(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final String mo4895() {
        int i10 = f903 + 23;
        f902 = i10 % 128;
        if ((i10 % 2 == 0 ? 'Q' : (char) 15) == 'Q') {
            AdRegistration.getVersion();
            throw null;
        }
        String version = AdRegistration.getVersion();
        int i11 = f902 + 75;
        f903 = i11 % 128;
        int i12 = i11 % 2;
        return version;
    }
}
