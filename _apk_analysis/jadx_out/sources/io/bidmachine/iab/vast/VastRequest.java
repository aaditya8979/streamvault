package io.bidmachine.iab.vast;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.measurer.MraidAdMeasurer;
import io.bidmachine.iab.measurer.VastAdMeasurer;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.vast.VastUrlProcessorRegistry;
import io.bidmachine.iab.vast.activity.VastActivity;
import io.bidmachine.iab.vast.activity.VastView;
import io.bidmachine.iab.vast.processor.DefaultMediaPicker;
import io.bidmachine.iab.vast.processor.VastAd;
import io.bidmachine.iab.vast.processor.VastMediaPicker;
import io.bidmachine.iab.vast.processor.VastProcessor;
import io.bidmachine.iab.vast.processor.VastProcessorResult;
import io.bidmachine.iab.vast.tags.AppodealExtensionTag;
import io.bidmachine.iab.vast.tags.MediaFileTag;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public class VastRequest {

    @NonNull
    public static final String PARAMS_ERROR_CODE = "params_error_code";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f69462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private VastAd f69463d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bundle f69465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private VastMediaPicker f69466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private VastVideoLoadedListener f69467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private VastAdMeasurer f69468i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Float f69470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f69471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f69472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f69473n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f69475p;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final VastUrlProcessorRegistry.OnUrlReadyCallback f69459z = new k();
    private static int A = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CacheControl f69461b = CacheControl.FullLoad;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VideoType f69464e = VideoType.NonRewarded;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f69469j = 3.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f69474o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f69476q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f69477r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f69478s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f69479t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f69480u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f69481v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f69482w = 5.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f69483x = new AtomicBoolean(false);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AtomicBoolean f69484y = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69460a = UUID.randomUUID().toString();

    public class Builder {
        public Builder() {
        }

        public Builder addExtra(@NonNull String str, @Nullable String str2) {
            VastRequest.this.addExtra(str, str2);
            return this;
        }

        @NonNull
        public VastRequest build() {
            return VastRequest.this;
        }

        public Builder forceUseNativeCloseTime(boolean z10) {
            VastRequest.this.f69472m = z10;
            return this;
        }

        public Builder setAdMeasurer(@Nullable VastAdMeasurer vastAdMeasurer) {
            VastRequest.this.f69468i = vastAdMeasurer;
            return this;
        }

        public Builder setAutoClose(boolean z10) {
            VastRequest.this.f69475p = z10;
            return this;
        }

        public Builder setCacheControl(@NonNull CacheControl cacheControl) {
            VastRequest.this.f69461b = cacheControl;
            return this;
        }

        public Builder setCompanionCloseTime(int i10) {
            VastRequest.this.f69471l = i10;
            return this;
        }

        public Builder setMaxDuration(int i10) {
            VastRequest.this.f69473n = i10;
            return this;
        }

        public Builder setMediaFilePicker(@Nullable VastMediaPicker<MediaFileTag> vastMediaPicker) {
            VastRequest.this.f69466g = vastMediaPicker;
            return this;
        }

        public Builder setPlaceholderTimeoutSec(float f10) {
            VastRequest.this.f69469j = f10;
            return this;
        }

        public Builder setPreloadCompanion(boolean z10) {
            VastRequest.this.f69478s = z10;
            return this;
        }

        public Builder setUseScreenSizeForCompanionOrientation(boolean z10) {
            VastRequest.this.f69477r = z10;
            return this;
        }

        public Builder setUseScreenSizeForVideoOrientation(boolean z10) {
            VastRequest.this.f69476q = z10;
            return this;
        }

        public Builder setVideoCloseTime(int i10) {
            VastRequest.this.f69470k = Float.valueOf(i10);
            return this;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69486a;

        static {
            int[] iArr = new int[CacheControl.values().length];
            f69486a = iArr;
            try {
                iArr[CacheControl.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69486a[CacheControl.Stream.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69486a[CacheControl.PartialLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f69487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VastRequestListener f69488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f69489c;

        public b(String str, VastRequestListener vastRequestListener, Context context) {
            this.f69487a = str;
            this.f69488b = vastRequestListener;
            this.f69489c = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            BufferedReader bufferedReader;
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new URL(this.f69487a).openStream()));
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        stringBuffer.append(line);
                        stringBuffer.append(System.getProperty("line.separator"));
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                }
                bufferedReader.close();
                VastRequest.this.loadVideoWithData(this.f69489c, stringBuffer.toString(), this.f69488b);
            } catch (Exception e11) {
                e = e11;
                bufferedReader2 = bufferedReader;
                VastLog.e("VastRequest", e);
                VastRequest.this.sendVastSpecError(VastSpecError.XML_PARSING);
                VastRequest.this.a(IabError.throwable("Exception during loading xml by url", e), this.f69488b);
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f69491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f69492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ VastRequestListener f69493c;

        public c(Context context, String str, VastRequestListener vastRequestListener) {
            this.f69491a = context;
            this.f69492b = str;
            this.f69493c = vastRequestListener;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            VastRequest.this.loadVideoWithDataSync(this.f69491a, this.f69492b, this.f69493c);
        }
    }

    public class d extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f69495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VastRequestListener f69496b;

        public d(Context context, VastRequestListener vastRequestListener) {
            this.f69495a = context;
            this.f69496b = vastRequestListener;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            VastRequest vastRequest = VastRequest.this;
            vastRequest.a(this.f69495a, vastRequest.f69463d, this.f69496b);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VastRequestListener f69498a;

        public e(VastRequestListener vastRequestListener) {
            this.f69498a = vastRequestListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f69498a.onVastLoaded(VastRequest.this);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IabError f69500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VastRequestListener f69501b;

        public f(IabError iabError, VastRequestListener vastRequestListener) {
            this.f69500a = iabError;
            this.f69501b = vastRequestListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            VastRequestListener vastRequestListener;
            VastRequest vastRequest;
            IabError iabErrorExpired;
            if (VastRequest.this.f69468i != null) {
                VastRequest.this.f69468i.onError(this.f69500a);
            }
            if (this.f69501b != null) {
                if (VastRequest.this.f69461b == CacheControl.PartialLoad && VastRequest.this.f69483x.get() && !VastRequest.this.f69484y.get()) {
                    vastRequestListener = this.f69501b;
                    vastRequest = VastRequest.this;
                    iabErrorExpired = IabError.expired(String.format("%s load failed after display - %s", vastRequest.f69461b, this.f69500a));
                } else {
                    vastRequestListener = this.f69501b;
                    vastRequest = VastRequest.this;
                    iabErrorExpired = this.f69500a;
                }
                vastRequestListener.onVastLoadFailed(vastRequest, iabErrorExpired);
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VastActivityListener f69503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IabError f69504b;

        public g(VastActivityListener vastActivityListener, IabError iabError) {
            this.f69503a = vastActivityListener;
            this.f69504b = iabError;
        }

        @Override // java.lang.Runnable
        public void run() {
            VastActivityListener vastActivityListener = this.f69503a;
            if (vastActivityListener != null) {
                vastActivityListener.onVastShowFailed(VastRequest.this, this.f69504b);
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VastViewListener f69506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VastView f69507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ IabError f69508c;

        public h(VastViewListener vastViewListener, VastView vastView, IabError iabError) {
            this.f69506a = vastViewListener;
            this.f69507b = vastView;
            this.f69508c = iabError;
        }

        @Override // java.lang.Runnable
        public void run() {
            VastViewListener vastViewListener = this.f69506a;
            if (vastViewListener != null) {
                vastViewListener.onShowFailed(this.f69507b, VastRequest.this, this.f69508c);
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VastAd f69510a;

        public i(VastAd vastAd) {
            this.f69510a = vastAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VastRequest.this.f69467h != null) {
                VastRequest.this.f69467h.onSuccess(VastRequest.this, this.f69510a);
            }
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IabError f69512a;

        public j(IabError iabError) {
            this.f69512a = iabError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VastRequest.this.f69467h != null) {
                VastRequest.this.f69467h.onError(VastRequest.this, this.f69512a);
            }
        }
    }

    public static class k implements VastUrlProcessorRegistry.OnUrlReadyCallback {
        @Override // io.bidmachine.iab.vast.VastUrlProcessorRegistry.OnUrlReadyCallback
        public void onUrlReady(String str) {
            VastLog.d("VastRequest", "Fire url: %s", str);
            Utils.simpleTrackUrl(str);
        }
    }

    public static class l implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f69514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public File f69515b;

        public l(File file) {
            this.f69515b = file;
            this.f69514a = file.lastModified();
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            long j10 = this.f69514a;
            long j11 = ((l) obj).f69514a;
            if (j10 > j11) {
                return -1;
            }
            return j10 == j11 ? 0 : 1;
        }
    }

    private VastRequest() {
    }

    private Uri a(Context context, String str) throws IOException {
        String strB = b(context);
        if (strB == null) {
            throw new FileNotFoundException("No dir for caching file");
        }
        File file = new File(strB);
        if (!file.exists()) {
            file.mkdirs();
        }
        int length = 230 - file.getPath().length();
        String str2 = "temp" + System.currentTimeMillis();
        String strReplace = str.substring(0, Math.min(length, str.length())).replace("/", "").replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "");
        File file2 = new File(file, strReplace);
        if (file2.exists()) {
            return Uri.fromFile(file2);
        }
        File file3 = new File(file, str2);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        InputStream inputStream = httpURLConnection.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(file3);
        long contentLength = httpURLConnection.getContentLength();
        long j10 = 0;
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                break;
            }
            fileOutputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
        fileOutputStream.close();
        if (contentLength != j10) {
            throw new IllegalStateException("The downloaded file size does not match the stated size");
        }
        file3.renameTo(new File(file, strReplace));
        return Uri.fromFile(new File(file, strReplace));
    }

    private Float a(VastAd vastAd, VastExtension vastExtension) {
        Float closeTimeSec = vastExtension != null ? vastExtension.getCloseTimeSec() : null;
        if (isForceUseNativeCloseTime()) {
            closeTimeSec = Utils.max(closeTimeSec, getVideoCloseTime());
        }
        Float fMin = Utils.min(closeTimeSec, vastAd.getDurationSec());
        return fMin == null ? Float.valueOf(5.0f) : fMin;
    }

    private void a(Context context) {
        File[] fileArrListFiles;
        try {
            String strB = b(context);
            if (strB == null || (fileArrListFiles = new File(strB).listFiles()) == null || fileArrListFiles.length <= A) {
                return;
            }
            l[] lVarArr = new l[fileArrListFiles.length];
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                lVarArr[i10] = new l(fileArrListFiles[i10]);
            }
            Arrays.sort(lVarArr);
            for (int i11 = 0; i11 < fileArrListFiles.length; i11++) {
                fileArrListFiles[i11] = lVarArr[i11].f69515b;
            }
            for (int i12 = A; i12 < fileArrListFiles.length; i12++) {
                if (!Uri.fromFile(fileArrListFiles[i12]).equals(this.f69462c)) {
                    fileArrListFiles[i12].delete();
                }
            }
        } catch (Exception e10) {
            VastLog.e("VastRequest", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, VastAd vastAd, VastRequestListener vastRequestListener) {
        String str;
        IabError iabErrorBadContent;
        try {
            Uri uriA = a(context, vastAd.getPickedMediaFileTag().getText());
            if (uriA != null && !TextUtils.isEmpty(uriA.getPath()) && new File(uriA.getPath()).exists()) {
                Bitmap bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(uriA.getPath(), 1);
                if (bitmapCreateVideoThumbnail == null) {
                    VastLog.d("VastRequest", "Video file not supported", new Object[0]);
                    sendVastSpecError(VastSpecError.BAD_FILE);
                    str = "Failed to get thumbnail by file URI";
                } else {
                    if (!bitmapCreateVideoThumbnail.equals(Bitmap.createBitmap(bitmapCreateVideoThumbnail.getWidth(), bitmapCreateVideoThumbnail.getHeight(), bitmapCreateVideoThumbnail.getConfig()))) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(context, uriA);
                            long j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                            int i10 = this.f69473n;
                            if (i10 == 0 || j10 <= i10) {
                                this.f69462c = uriA;
                                a(vastAd);
                                a(vastRequestListener);
                            } else {
                                sendVastSpecError(VastSpecError.DURATION);
                                a(IabError.badContent("Estimated duration does not match actual duration"), vastRequestListener);
                            }
                        } catch (Exception e10) {
                            VastLog.e("VastRequest", e10);
                            sendVastSpecError(VastSpecError.BAD_FILE);
                            iabErrorBadContent = IabError.throwable("Exception during metadata retrieval", e10);
                            a(iabErrorBadContent, vastRequestListener);
                        }
                        a(context);
                        return;
                    }
                    VastLog.d("VastRequest", "Empty thumbnail", new Object[0]);
                    sendVastSpecError(VastSpecError.BAD_FILE);
                    str = "Thumbnail is empty";
                }
                iabErrorBadContent = IabError.badContent(str);
                a(iabErrorBadContent, vastRequestListener);
                a(context);
                return;
            }
            VastLog.d("VastRequest", "fileUri is null", new Object[0]);
            sendVastSpecError(VastSpecError.BAD_URI);
            a(IabError.badContent("Can't find video by local URI"), vastRequestListener);
        } catch (Exception e11) {
            VastLog.e("VastRequest", e11);
            sendVastSpecError(VastSpecError.BAD_URI);
            a(IabError.throwable("Exception during caching media file", e11), vastRequestListener);
        }
    }

    private synchronized void a(IabError iabError) {
        if (this.f69467h == null) {
            return;
        }
        Utils.onUiThread(new j(iabError));
    }

    private void a(IabError iabError, VastActivityListener vastActivityListener) {
        VastLog.d("VastRequest", "sendShowFailed - %s", iabError);
        Utils.onUiThread(new g(vastActivityListener, iabError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IabError iabError, VastRequestListener vastRequestListener) {
        VastLog.d("VastRequest", "sendLoadFailed - %s", iabError);
        a(iabError);
        Utils.onUiThread(new f(iabError, vastRequestListener));
    }

    private void a(IabError iabError, VastView vastView, VastViewListener vastViewListener) {
        VastLog.d("VastRequest", "sendShowFailed - %s", iabError);
        Utils.onUiThread(new h(vastViewListener, vastView, iabError));
    }

    private void a(VastRequestListener vastRequestListener) {
        if (this.f69483x.getAndSet(true)) {
            return;
        }
        VastLog.d("VastRequest", "sendLoaded", new Object[0]);
        if (vastRequestListener != null) {
            Utils.onUiThread(new e(vastRequestListener));
        }
    }

    private synchronized void a(VastAd vastAd) {
        if (this.f69467h == null) {
            return;
        }
        Utils.onUiThread(new i(vastAd));
    }

    private String b(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getPath() + "/vast_rtb_cache/";
    }

    public static Builder newBuilder() {
        return new VastRequest().new Builder();
    }

    public static void setCacheSize(int i10) {
        if (i10 > 0) {
            A = i10;
        }
    }

    public void addExtra(String str, String str2) {
        if (this.f69465f == null) {
            this.f69465f = new Bundle();
        }
        this.f69465f.putString(str, str2);
    }

    public boolean canDisplay() {
        return this.f69483x.get() && (this.f69461b != CacheControl.FullLoad || checkFile());
    }

    public boolean checkFile() {
        try {
            Uri uri = this.f69462c;
            if (uri == null || TextUtils.isEmpty(uri.getPath())) {
                return false;
            }
            return new File(this.f69462c.getPath()).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public void destroy() {
        this.f69467h = null;
        VastRequestManager.a(this);
    }

    public void display(@NonNull Context context, @NonNull VideoType videoType, @Nullable VastActivityListener vastActivityListener) {
        display(context, videoType, vastActivityListener, null, null, null);
    }

    public void display(@NonNull Context context, @NonNull VideoType videoType, @Nullable VastActivityListener vastActivityListener, @Nullable VastView vastView, @Nullable VastPlaybackListener vastPlaybackListener, @Nullable MraidAdMeasurer mraidAdMeasurer) {
        VastLog.d("VastRequest", "display", new Object[0]);
        this.f69484y.set(true);
        if (this.f69463d == null) {
            a(IabError.internal("VastAd is null during display VastActivity"), vastActivityListener);
            return;
        }
        this.f69464e = videoType;
        this.f69474o = context.getResources().getConfiguration().orientation;
        IabError iabErrorDisplay = new VastActivity.Builder().setRequest(this).setListener(vastActivityListener).setVastView(vastView).setPlaybackListener(vastPlaybackListener).setAdMeasurer(this.f69468i).setPostBannerAdMeasurer(mraidAdMeasurer).display(context);
        if (iabErrorDisplay != null) {
            a(iabErrorDisplay, vastActivityListener);
        }
    }

    public void display(@NonNull VastView vastView) {
        this.f69484y.set(true);
        if (this.f69463d == null) {
            a(IabError.internal("VastAd is null during display VastView"), vastView, vastView.getListener());
            return;
        }
        this.f69464e = VideoType.NonRewarded;
        VastRequestManager.store(this);
        vastView.display(this, Boolean.FALSE);
    }

    public void fireErrorUrls(@Nullable List<String> list, @Nullable Bundle bundle) {
        fireUrls(list, bundle);
    }

    public void fireUrls(@Nullable List<String> list, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f69465f;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (list != null) {
            VastUrlProcessorRegistry.processUrls(list, bundle2, f69459z);
        } else {
            VastLog.d("VastRequest", "Url list is null", new Object[0]);
        }
    }

    @NonNull
    public CacheControl getCacheControl() {
        return this.f69461b;
    }

    public float getCompanionCloseTime() {
        return this.f69471l;
    }

    @Nullable
    public Uri getFileUri() {
        return this.f69462c;
    }

    public int getForceOrientation() {
        return this.f69481v;
    }

    public float getFusedVideoCloseTimeSec() {
        return this.f69482w;
    }

    @NonNull
    public String getId() {
        return this.f69460a;
    }

    public int getMaxDurationMillis() {
        return this.f69473n;
    }

    public float getPlaceholderTimeoutSec() {
        return this.f69469j;
    }

    public int getPreferredVideoOrientation() {
        if (!shouldUseScreenSizeForVideoOrientation()) {
            return 0;
        }
        VastAd vastAd = this.f69463d;
        if (vastAd == null) {
            return 2;
        }
        MediaFileTag pickedMediaFileTag = vastAd.getPickedMediaFileTag();
        return Utils.orientationBySize(pickedMediaFileTag.getWidth(), pickedMediaFileTag.getHeight());
    }

    public int getRequestedOrientation() {
        return this.f69474o;
    }

    @Nullable
    public VastAd getVastAd() {
        return this.f69463d;
    }

    @Nullable
    public Float getVideoCloseTime() {
        return this.f69470k;
    }

    @NonNull
    public VideoType getVideoType() {
        return this.f69464e;
    }

    public boolean isAutoClose() {
        return this.f69475p;
    }

    public boolean isForceUseNativeCloseTime() {
        return this.f69472m;
    }

    public boolean isR1() {
        return this.f69479t;
    }

    public boolean isR2() {
        return this.f69480u;
    }

    public void loadVideoWithData(@NonNull Context context, @NonNull String str, @Nullable VastRequestListener vastRequestListener) {
        IabError iabErrorThrowable;
        VastLog.d("VastRequest", "loadVideoWithData\n%s", str);
        this.f69463d = null;
        if (Utils.isNetworkAvailable(context)) {
            try {
                new c(context, str, vastRequestListener).start();
                return;
            } catch (Exception e10) {
                VastLog.e("VastRequest", e10);
                iabErrorThrowable = IabError.throwable("Exception during creating background thread", e10);
            }
        } else {
            iabErrorThrowable = IabError.NO_NETWORK;
        }
        a(iabErrorThrowable, vastRequestListener);
    }

    public void loadVideoWithDataSync(@NonNull Context context, @NonNull String str, @Nullable VastRequestListener vastRequestListener) {
        String str2;
        VastMediaPicker defaultMediaPicker = this.f69466g;
        if (defaultMediaPicker == null) {
            defaultMediaPicker = new DefaultMediaPicker(context);
        }
        VastProcessorResult vastProcessorResultProcess = new VastProcessor(this, defaultMediaPicker).process(str);
        VastAd vastAd = vastProcessorResultProcess.getVastAd();
        this.f69463d = vastAd;
        if (vastAd == null) {
            VastSpecError vastSpecError = vastProcessorResultProcess.getVastSpecError();
            if (vastSpecError != null) {
                sendVastSpecError(vastSpecError);
                str2 = String.format("VastAd is null during loadVideoWithDataSync with VastSpecCode - %s", Integer.valueOf(vastSpecError.getCode()));
            } else {
                str2 = "VastAd is null during loadVideoWithDataSync without VastSpecCode";
            }
            a(IabError.badContent(str2), vastRequestListener);
            return;
        }
        vastAd.setVastRequest(this);
        AppodealExtensionTag appodealExtension = this.f69463d.getAppodealExtension();
        if (appodealExtension != null) {
            Boolean boolIsAutoRotate = appodealExtension.isAutoRotate();
            if (boolIsAutoRotate != null) {
                if (boolIsAutoRotate.booleanValue()) {
                    this.f69476q = false;
                    this.f69477r = false;
                } else {
                    this.f69476q = true;
                    this.f69477r = true;
                }
            }
            if (appodealExtension.getPostBannerTag().getCloseTimeSec() > 0.0f) {
                this.f69471l = appodealExtension.getPostBannerTag().getCloseTimeSec();
            }
            this.f69479t = appodealExtension.isR1();
            this.f69480u = appodealExtension.isR2();
            Integer forceOrientation = appodealExtension.getForceOrientation();
            if (forceOrientation != null) {
                this.f69481v = forceOrientation.intValue();
            }
        }
        this.f69482w = a(this.f69463d, appodealExtension).floatValue();
        VastAdMeasurer vastAdMeasurer = this.f69468i;
        if (vastAdMeasurer != null) {
            vastAdMeasurer.onVastModelLoaded(this);
        }
        int i10 = a.f69486a[this.f69461b.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                a(vastRequestListener);
                return;
            } else if (i10 != 3) {
                return;
            } else {
                a(vastRequestListener);
            }
        }
        a(context, this.f69463d, vastRequestListener);
    }

    public void loadVideoWithUrl(@NonNull Context context, @NonNull String str, @Nullable VastRequestListener vastRequestListener) {
        IabError iabErrorThrowable;
        VastLog.d("VastRequest", "loadVideoWithUrl - %s", str);
        this.f69463d = null;
        if (Utils.isNetworkAvailable(context)) {
            try {
                new b(str, vastRequestListener, context).start();
                return;
            } catch (Exception e10) {
                VastLog.e("VastRequest", e10);
                iabErrorThrowable = IabError.throwable("Exception during creating background thread", e10);
            }
        } else {
            iabErrorThrowable = IabError.NO_NETWORK;
        }
        a(iabErrorThrowable, vastRequestListener);
    }

    public void performCache(@NonNull Context context, @Nullable VastRequestListener vastRequestListener) {
        if (this.f69463d == null) {
            a(IabError.internal("VastAd is null during performCache"), vastRequestListener);
            return;
        }
        try {
            new d(context, vastRequestListener).start();
        } catch (Exception e10) {
            VastLog.e("VastRequest", e10);
            a(IabError.throwable("Exception during creating background thread", e10), vastRequestListener);
        }
    }

    public void sendVastSpecError(@NonNull VastSpecError vastSpecError) {
        VastLog.d("VastRequest", "sendVastSpecError - %s", vastSpecError);
        try {
            if (this.f69463d != null) {
                Bundle bundle = new Bundle();
                bundle.putInt(PARAMS_ERROR_CODE, vastSpecError.getCode());
                fireErrorUrls(this.f69463d.getErrorUrlList(), bundle);
            }
        } catch (Exception e10) {
            VastLog.e("VastRequest", e10);
        }
    }

    public synchronized void setVastVideoLoadedListener(@Nullable VastVideoLoadedListener vastVideoLoadedListener) {
        this.f69467h = vastVideoLoadedListener;
    }

    public boolean shouldPreloadCompanion() {
        return this.f69478s;
    }

    public boolean shouldUseScreenSizeForCompanionOrientation() {
        return this.f69477r;
    }

    public boolean shouldUseScreenSizeForVideoOrientation() {
        return this.f69476q;
    }
}
