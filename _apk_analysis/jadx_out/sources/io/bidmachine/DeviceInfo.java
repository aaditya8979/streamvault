package io.bidmachine;

import android.content.Context;
import android.media.AudioManager;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import io.bidmachine.core.Utils;
import io.bidmachine.util.DeviceUtils;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceInfo {
    private static final String OS_NAME = "android";
    private static volatile DeviceInfo instance;

    @NonNull
    private final y3 cache;

    @NonNull
    private final b cpu;

    @NonNull
    private final c gpu;

    @Nullable
    private String hwv;

    @Nullable
    private Boolean isRooted;
    public final boolean isTablet;

    @Nullable
    public final String manufacturer;

    @Nullable
    public final String model;

    @NonNull
    public final String osName;

    @NonNull
    public final String osVersion;

    @Nullable
    public final String phoneCarrier;

    @Nullable
    public final String phoneMCCMNC;
    public final float screenDensity;
    public final int screenDpi;

    @Nullable
    private Long totalDiskSpaceInMB;

    @NonNull
    private final a audio = new a();

    @NonNull
    private final d ram = new d();

    public static final class a {
        @Nullable
        private AudioManager getAudioManager(@NonNull Context context) {
            return (AudioManager) context.getSystemService("audio");
        }

        @Nullable
        public Float getVolumeLevel(@NonNull Context context) {
            AudioManager audioManager = getAudioManager(context);
            if (audioManager == null) {
                return null;
            }
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3) - (Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0);
            return streamMaxVolume == 0 ? Float.valueOf(0.0f) : Float.valueOf((streamVolume - r3) / streamMaxVolume);
        }

        @Nullable
        public Boolean isRingMuted(@NonNull Context context) {
            AudioManager audioManager = getAudioManager(context);
            if (audioManager == null) {
                return null;
            }
            int ringerMode = audioManager.getRingerMode();
            boolean z10 = true;
            if (ringerMode != 0 && ringerMode != 1) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class b {

        @NonNull
        public static final String KEY_NAME = "cpu_name";

        @NonNull
        public static final String KEY_VENDOR = "cpu_vendor";

        @NonNull
        private final y3 cache;

        @Nullable
        private String name;

        @Nullable
        private String vendor;

        public b(@NonNull y3 y3Var) {
            this.cache = y3Var;
        }

        private void extract() throws Throwable {
            read();
            if (TextUtils.isEmpty(this.name)) {
                this.name = Build.BOARD;
            }
            if (TextUtils.isEmpty(this.vendor)) {
                this.vendor = Build.HARDWARE;
            }
        }

        @Nullable
        private String findValue(String str) {
            Matcher matcher = Pattern.compile(":\\s*(.*)").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        }

        private void read() throws Throwable {
            RandomAccessFile randomAccessFile;
            Throwable th2;
            RandomAccessFile randomAccessFile2 = null;
            try {
                randomAccessFile = new RandomAccessFile("/proc/cpuinfo", "r");
                while (true) {
                    try {
                        String line = randomAccessFile.readLine();
                        if (line != null) {
                            if (line.startsWith("model name:") || line.startsWith("Hardware:")) {
                                this.name = findValue(line);
                            } else if (line.startsWith("vendor_id:")) {
                                this.vendor = findValue(line);
                            }
                            if (this.name != null && this.vendor != null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception unused) {
                        randomAccessFile2 = randomAccessFile;
                        Utils.close(randomAccessFile2);
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        Utils.close(randomAccessFile);
                        throw th2;
                    }
                }
                Utils.close(randomAccessFile);
            } catch (Exception unused2) {
            } catch (Throwable th4) {
                randomAccessFile = null;
                th2 = th4;
            }
        }

        @Nullable
        public String getName() {
            return this.name;
        }

        @Nullable
        public String getVendor() {
            return this.vendor;
        }

        public void update(@NonNull Context context) throws Throwable {
            if (TextUtils.isEmpty(this.name)) {
                this.name = this.cache.read(context, KEY_NAME);
            }
            if (TextUtils.isEmpty(this.vendor)) {
                this.vendor = this.cache.read(context, KEY_VENDOR);
            }
            if (TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.vendor)) {
                extract();
                this.cache.store(context, KEY_NAME, this.name);
                this.cache.store(context, KEY_VENDOR, this.vendor);
            }
        }
    }

    public static final class c {

        @NonNull
        public static final String KEY_NAME = "gpu_name";

        @NonNull
        public static final String KEY_VENDOR = "gpu_vendor";

        @NonNull
        private final y3 cache;

        @Nullable
        private String name;

        @Nullable
        private String vendor;

        public c(@NonNull y3 y3Var) {
            this.cache = y3Var;
        }

        private EGLConfig chooseEGLConfig(EGLDisplay eGLDisplay) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr = new int[1];
            EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0);
            if (iArr[0] == 0) {
                return null;
            }
            return eGLConfigArr[0];
        }

        private void cleanUpEGL(@Nullable EGLDisplay eGLDisplay, @Nullable EGLSurface eGLSurface, @Nullable EGLContext eGLContext) {
            if (eGLDisplay != null) {
                makeCurrent(eGLDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                if (eGLSurface != null) {
                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                }
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                }
                EGL14.eglTerminate(eGLDisplay);
            }
        }

        private EGLContext createEGLContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        }

        private EGLSurface createEGLSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        }

        private void extract() throws Throwable {
            EGLContext eGLContext;
            EGLSurface eGLSurfaceCreateEGLSurface;
            EGLContext eGLContext2;
            EGLContext eGLContext3;
            EGLDisplay eGLDisplay = null;
            eGLContextCreateEGLContext = null;
            EGLContext eGLContextCreateEGLContext = null;
            EGLSurface eGLSurface = null;
            EGLDisplay eGLDisplay2 = null;
            try {
                EGLDisplay eGLDisplayInitEGLDisplay = initEGLDisplay();
                try {
                    EGLConfig eGLConfigChooseEGLConfig = chooseEGLConfig(eGLDisplayInitEGLDisplay);
                    if (eGLConfigChooseEGLConfig != null) {
                        eGLSurfaceCreateEGLSurface = createEGLSurface(eGLDisplayInitEGLDisplay, eGLConfigChooseEGLConfig);
                        try {
                            eGLContextCreateEGLContext = createEGLContext(eGLDisplayInitEGLDisplay, eGLConfigChooseEGLConfig);
                            makeCurrent(eGLDisplayInitEGLDisplay, eGLSurfaceCreateEGLSurface, eGLContextCreateEGLContext);
                            this.name = GLES20.glGetString(7937);
                            this.vendor = GLES20.glGetString(7936);
                            eGLContext3 = eGLContextCreateEGLContext;
                            eGLSurface = eGLSurfaceCreateEGLSurface;
                        } catch (Exception unused) {
                            eGLContext2 = eGLContextCreateEGLContext;
                            eGLDisplay2 = eGLDisplayInitEGLDisplay;
                            cleanUpEGL(eGLDisplay2, eGLSurfaceCreateEGLSurface, eGLContext2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            eGLContext = eGLContextCreateEGLContext;
                            eGLDisplay = eGLDisplayInitEGLDisplay;
                            cleanUpEGL(eGLDisplay, eGLSurfaceCreateEGLSurface, eGLContext);
                            throw th;
                        }
                    } else {
                        eGLContext3 = null;
                    }
                    cleanUpEGL(eGLDisplayInitEGLDisplay, eGLSurface, eGLContext3);
                } catch (Exception unused2) {
                    eGLSurfaceCreateEGLSurface = null;
                    eGLDisplay2 = eGLDisplayInitEGLDisplay;
                    eGLContext2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    eGLSurfaceCreateEGLSurface = null;
                    eGLDisplay = eGLDisplayInitEGLDisplay;
                    eGLContext = null;
                }
            } catch (Exception unused3) {
                eGLContext2 = null;
                eGLSurfaceCreateEGLSurface = null;
            } catch (Throwable th4) {
                th = th4;
                eGLContext = null;
                eGLSurfaceCreateEGLSurface = null;
            }
        }

        private EGLDisplay initEGLDisplay() {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            int[] iArr = new int[2];
            EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
            return eGLDisplayEglGetDisplay;
        }

        private void makeCurrent(@Nullable EGLDisplay eGLDisplay, @Nullable EGLSurface eGLSurface, @Nullable EGLContext eGLContext) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }

        @Nullable
        public String getName() {
            return this.name;
        }

        @Nullable
        public String getVendor() {
            return this.vendor;
        }

        public void update(@NonNull Context context) throws Throwable {
            if (TextUtils.isEmpty(this.name)) {
                this.name = this.cache.read(context, KEY_NAME);
            }
            if (TextUtils.isEmpty(this.vendor)) {
                this.vendor = this.cache.read(context, KEY_VENDOR);
            }
            if (TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.vendor)) {
                extract();
                this.cache.store(context, KEY_NAME, this.name);
                this.cache.store(context, KEY_VENDOR, this.vendor);
            }
        }
    }

    public static final class d {

        @Nullable
        private Long freeMem;

        @Nullable
        private Long totalMem;

        @Nullable
        private String findValue(@Nullable String str) {
            Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        }

        @Nullable
        private Long parseValue(@Nullable String str) {
            if (str != null) {
                try {
                    return Long.valueOf(Long.parseLong(str) * 1024);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }

        @Nullable
        public Long getFreeMemBytes() {
            return this.freeMem;
        }

        @Nullable
        public Long getTotalMemBytes() {
            return this.totalMem;
        }

        public void update() throws Throwable {
            RandomAccessFile randomAccessFile;
            Throwable th2;
            RandomAccessFile randomAccessFile2 = null;
            try {
                randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, "r");
                while (true) {
                    try {
                        String line = randomAccessFile.readLine();
                        if (line != null) {
                            if (line.startsWith("MemTotal:")) {
                                this.totalMem = parseValue(findValue(line));
                            } else if (line.startsWith("MemAvailable:")) {
                                this.freeMem = parseValue(findValue(line));
                            }
                            if (this.totalMem != null && this.freeMem != null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception unused) {
                        randomAccessFile2 = randomAccessFile;
                        Utils.close(randomAccessFile2);
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        Utils.close(randomAccessFile);
                        throw th2;
                    }
                }
                Utils.close(randomAccessFile);
            } catch (Exception unused2) {
            } catch (Throwable th4) {
                randomAccessFile = null;
                th2 = th4;
            }
        }
    }

    private DeviceInfo(@NonNull Context context) {
        y3 y3Var = new y3();
        this.cache = y3Var;
        this.cpu = new b(y3Var);
        this.gpu = new c(y3Var);
        this.osName = "android";
        this.osVersion = String.valueOf(Build.VERSION.SDK_INT);
        this.manufacturer = DeviceUtils.getManufacturer();
        this.model = DeviceUtils.getModel();
        this.screenDpi = io.bidmachine.utils.DeviceUtils.getScreenDpi(context);
        this.screenDensity = DeviceUtils.getScreenDensity(context);
        this.isTablet = DeviceUtils.isTablet(context);
        this.phoneMCCMNC = DeviceUtils.getPhoneMCCMNC(context);
        this.phoneCarrier = DeviceUtils.getPhoneOperatorName(context);
    }

    @Nullable
    private String getKernelVersionThroughProcVersion() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th2;
        try {
            randomAccessFile = new RandomAccessFile("/proc/version", "r");
            try {
                String line = randomAccessFile.readLine();
                Utils.close(randomAccessFile);
                return line;
            } catch (Exception unused) {
                Utils.close(randomAccessFile);
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                Utils.close(randomAccessFile);
                throw th2;
            }
        } catch (Exception unused2) {
            randomAccessFile = null;
        } catch (Throwable th4) {
            randomAccessFile = null;
            th2 = th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.BufferedReader, java.io.Closeable] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String getKernelVersionThroughUName() throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L48
            java.lang.String r2 = "uname -a"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L48
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.io.InputStream r3 = r1.getInputStream()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L4b
            io.bidmachine.core.Utils.close(r3)
            io.bidmachine.core.Utils.close(r2)
            r1.destroy()
            return r0
        L27:
            r0 = move-exception
            goto L3c
        L29:
            r3 = move-exception
            r4 = r3
            r3 = r0
            r0 = r4
            goto L3c
        L2e:
            r3 = r0
            goto L4b
        L30:
            r2 = move-exception
            r3 = r0
            r0 = r2
            r2 = r3
            goto L3c
        L35:
            r2 = r0
            goto L4a
        L37:
            r1 = move-exception
            r2 = r0
            r3 = r2
            r0 = r1
            r1 = r3
        L3c:
            io.bidmachine.core.Utils.close(r3)
            io.bidmachine.core.Utils.close(r2)
            if (r1 == 0) goto L47
            r1.destroy()
        L47:
            throw r0
        L48:
            r1 = r0
            r2 = r1
        L4a:
            r3 = r2
        L4b:
            io.bidmachine.core.Utils.close(r3)
            io.bidmachine.core.Utils.close(r2)
            if (r1 == 0) goto L56
            r1.destroy()
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.DeviceInfo.getKernelVersionThroughUName():java.lang.String");
    }

    @NonNull
    public static DeviceInfo obtain(@NonNull Context context) {
        DeviceInfo deviceInfo = instance;
        if (deviceInfo == null) {
            synchronized (DeviceInfo.class) {
                deviceInfo = instance;
                if (deviceInfo == null) {
                    deviceInfo = new DeviceInfo(context);
                    instance = deviceInfo;
                }
            }
        }
        return deviceInfo;
    }

    @NonNull
    public a getAudio() {
        return this.audio;
    }

    @Nullable
    public Long getAvailableDiskSpaceInMB() {
        try {
            if (!Utils.isExternalMemoryAvailable()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return Long.valueOf((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Exception unused) {
            return null;
        }
    }

    @NonNull
    public b getCpu() {
        return this.cpu;
    }

    @NonNull
    public c getGpu() {
        return this.gpu;
    }

    @Nullable
    public String getHWV() throws Throwable {
        String str = this.hwv;
        if (str != null) {
            return str;
        }
        String kernelVersionThroughProcVersion = getKernelVersionThroughProcVersion();
        if (!TextUtils.isEmpty(kernelVersionThroughProcVersion)) {
            this.hwv = kernelVersionThroughProcVersion;
            return kernelVersionThroughProcVersion;
        }
        String kernelVersionThroughUName = getKernelVersionThroughUName();
        this.hwv = kernelVersionThroughUName;
        return kernelVersionThroughUName;
    }

    @NonNull
    public d getRam() {
        return this.ram;
    }

    @Nullable
    public Long getTotalDiskSpaceInMB() {
        Long l10 = this.totalDiskSpaceInMB;
        if (l10 != null) {
            return l10;
        }
        try {
            if (!Utils.isExternalMemoryAvailable()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            Long lValueOf = Long.valueOf((statFs.getBlockSizeLong() * statFs.getBlockCountLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            this.totalDiskSpaceInMB = lValueOf;
            return lValueOf;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isDeviceRooted() {
        /*
            r11 = this;
            java.lang.Boolean r0 = r11.isRooted
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            r0 = 8
            r1 = 1
            r2 = 0
            java.lang.String r3 = "/sbin/su"
            java.lang.String r4 = "/system/bin/su"
            java.lang.String r5 = "/system/xbin/su"
            java.lang.String r6 = "/data/local/xbin/su"
            java.lang.String r7 = "/data/local/bin/su"
            java.lang.String r8 = "/system/sd/xbin/su"
            java.lang.String r9 = "/system/bin/failsafe/su"
            java.lang.String r10 = "/data/local/su"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10}     // Catch: java.lang.Exception -> L39
            r4 = r2
        L22:
            if (r4 >= r0) goto L39
            r5 = r3[r4]     // Catch: java.lang.Exception -> L39
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> L39
            r6.<init>(r5)     // Catch: java.lang.Exception -> L39
            boolean r5 = r6.exists()     // Catch: java.lang.Exception -> L39
            if (r5 == 0) goto L36
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L39
            r11.isRooted = r0     // Catch: java.lang.Exception -> L39
            return r1
        L36:
            int r4 = r4 + 1
            goto L22
        L39:
            r0 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L75
            java.lang.String r4 = "/system/xbin/which"
            java.lang.String r5 = "su"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L75
            java.lang.Process r0 = r3.exec(r4)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L75
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L75
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L75
            java.io.InputStream r5 = r0.getInputStream()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L75
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L75
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L75
            java.lang.String r3 = r3.readLine()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L75
            if (r3 == 0) goto L5f
            goto L60
        L5f:
            r1 = r2
        L60:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L75
            r11.isRooted = r1     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L75
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L75
            r0.destroy()
            return r1
        L6e:
            r1 = move-exception
            if (r0 == 0) goto L74
            r0.destroy()
        L74:
            throw r1
        L75:
            if (r0 == 0) goto L7a
            r0.destroy()
        L7a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r11.isRooted = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.DeviceInfo.isDeviceRooted():boolean");
    }

    public void updateHwInfo(@NonNull Context context) throws Throwable {
        this.cpu.update(context);
        this.gpu.update(context);
        this.ram.update();
    }
}
