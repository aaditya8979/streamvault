package com.yk.e.util;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.Y5;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.yk.e.net.TaskThreadPool;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class FileLoader {
    public Context context;
    public String filePath;
    public String fileUrl;
    public String packageName;
    public long startTime;
    public String strSpeed;
    public ArrayList<FileLoadCallBack> callBackList = new ArrayList<>();
    public long lastDownSize = 0;
    public long lastTime = 0;
    public long lastProgress = 0;
    public long fileContentSize = 0;
    public Handler handler = new Handler(new Handler.Callback() { // from class: com.yk.e.util.FileLoader.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == -1) {
                Intent intent = new Intent(Constant.ActionDownLoad);
                intent.putExtra(Y5.c.f30723a, FileLoader.this.fileUrl);
                intent.putExtra("downLoadFail", true);
                FileLoader.this.context.sendBroadcast(intent);
            } else {
                FileLoader.this.sendPackageName();
            }
            if (new File(FileLoader.this.filePath).exists()) {
                double dRound = ((double) Math.round(((System.currentTimeMillis() - FileLoader.this.startTime) * 100) / 1000)) / 100.0d;
                LogUtil.i("zhazha", "文件花费的时间 = " + dRound + "秒");
                LogUtil.i("zhazha", "总下载平均速度 = " + FileLoader.this.initSpeedStr(((double) FileLoader.this.fileContentSize) / dRound));
            }
            FileLoader.this.callBack();
            Constant.removeFileLoader(FileLoader.this.fileUrl);
            return false;
        }
    });

    public interface FileLoadCallBack {
        void execute(String str);
    }

    public FileLoader(String str) {
        this.fileUrl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callBack() {
        for (int i10 = 0; i10 < this.callBackList.size(); i10++) {
            try {
                FileLoadCallBack fileLoadCallBack = this.callBackList.get(i10);
                if (fileLoadCallBack != null) {
                    fileLoadCallBack.execute(this.filePath);
                }
            } catch (Exception e10) {
                AdLog.e("FileLoader callback error, msg = " + e10.getMessage(), e10);
                return;
            }
        }
    }

    public static String getPathByUrl(Context context, String str) {
        String fileNameFromUrl;
        String absolutePath = "";
        File file = new File(AppUtil.getCacheDirectory(context), Constant.fileLoaderPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            if (str.contains(".apk")) {
                fileNameFromUrl = StringUtil.getFileNameFromUrl(str, "apk");
                if (fileNameFromUrl.length() > 30) {
                    fileNameFromUrl = fileNameFromUrl.substring(fileNameFromUrl.length() - 30);
                }
            } else {
                fileNameFromUrl = str.contains(".mp4") ? StringUtil.getFileNameFromUrl(str, "mp4") : "";
            }
            absolutePath = new File(file.getAbsolutePath() + "/" + fileNameFromUrl).getAbsolutePath();
        } catch (Exception e10) {
            LogUtil.printException(e10);
        }
        LogUtil.i("zhazha", "filePath = " + absolutePath);
        return absolutePath;
    }

    public static boolean isApkVaild(Context context, String str) {
        String pathByUrl = getPathByUrl(context, str);
        String packageName = AppUtil.getPackageName(context, pathByUrl);
        File file = new File(pathByUrl);
        if (!file.exists()) {
            return false;
        }
        if (!TextUtils.isEmpty(packageName)) {
            return true;
        }
        file.delete();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0185 A[Catch: Exception -> 0x0181, TRY_LEAVE, TryCatch #8 {Exception -> 0x0181, blocks: (B:59:0x017d, B:63:0x0185), top: B:70:0x017d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loadFileFromNet() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yk.e.util.FileLoader.loadFileFromNet():void");
    }

    private void showSpeed(int i10, int i11) {
        if (this.lastTime == 0) {
            this.lastTime = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.lastTime;
        if (jCurrentTimeMillis - j10 == 0) {
            return;
        }
        if (jCurrentTimeMillis - j10 >= 1000 || i11 != this.lastProgress) {
            this.lastTime = jCurrentTimeMillis;
            this.lastDownSize = i10;
            this.lastProgress = i11;
        }
    }

    public String getTrueUrl(String str) {
        String string;
        if (str.contains(".mp4") || str.contains(".apk")) {
            return str;
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            httpURLConnection.setRequestMethod("GET");
            LogUtil.i("zhazha", "获取真实url中 con.getResponseCode() = " + httpURLConnection.getResponseCode());
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                string = httpURLConnection.getURL().toString();
                LogUtil.i("zhazha", "200获取真实url中 realUrl = " + string);
            } else if (responseCode == 307 || responseCode == 301 || responseCode == 302) {
                string = httpURLConnection.getHeaderField("Location");
                LogUtil.i("zhazha", "非200获取真实url中 realUrl = " + string);
            } else {
                string = "";
            }
            return string.contains(".apk") ? string : getTrueUrl(string);
        } catch (Exception e10) {
            LogUtil.printException(e10);
            return "";
        }
    }

    public String initSpeedStr(double d10) {
        this.strSpeed = "";
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (d10 > 1024.0d) {
            StringBuilder sb2 = new StringBuilder();
            double d11 = d10 / 1024.0d;
            sb2.append(decimalFormat.format(d11));
            sb2.append("KB/S");
            this.strSpeed = sb2.toString();
            if (d10 > 1048576.0d) {
                this.strSpeed = decimalFormat.format(d11 / 1024.0d) + "MB/S";
            }
        } else {
            this.strSpeed = d10 + "B/S";
        }
        return this.strSpeed;
    }

    public void loadFile(Context context) {
        if (Constant.fileLoadRunning(this.fileUrl)) {
            AdLog.d("dl", "已经在下载中fileUrl = " + this.fileUrl);
            return;
        }
        this.context = context;
        AdLog.d("dl", "fileUrl = " + this.fileUrl);
        this.filePath = getPathByUrl(context, this.fileUrl);
        if (!new File(this.filePath).exists()) {
            Constant.downLoadMap.put(this.fileUrl, this);
            TaskThreadPool.executeRunnable(new Runnable() { // from class: com.yk.e.util.FileLoader.2
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    FileLoader.this.loadFileFromNet();
                }
            });
        } else {
            AdLog.d("dl", "loadFile 文件已存在");
            callBack();
            Constant.removeFileLoader(this.fileUrl);
        }
    }

    public void sendPackageName() {
        if (this.filePath.lastIndexOf(".apk") != -1) {
            this.packageName = AppUtil.getPackageName(this.context, this.filePath);
            Intent intent = new Intent(Constant.ActionDownLoad);
            intent.putExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.packageName);
            this.context.sendBroadcast(intent);
        }
    }

    public void setCallBack(FileLoadCallBack fileLoadCallBack) {
        if (fileLoadCallBack != null) {
            this.callBackList.add(fileLoadCallBack);
        }
    }
}
