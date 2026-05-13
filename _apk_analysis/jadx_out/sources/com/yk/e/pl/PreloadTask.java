package com.yk.e.pl;

import com.yk.e.util.AdLog;
import com.yk.e.util.CoreUtils;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import z0.f;

/* JADX INFO: loaded from: classes11.dex */
public class PreloadTask implements Runnable {
    private static final List<String> blackList = new ArrayList();
    private IPreloadCallback callback;
    public f mCacheServer;
    private boolean mIsCanceled;
    private boolean mIsExecuted;
    public int mPosition;
    public String mRawUrl;
    public boolean mIsAll = false;
    private boolean isCallbackSuccess = false;
    private final int RETRY_TIMES = 2;

    public interface IPreloadCallback {
        void onCancel(int i10);

        void onFailed(int i10, String str);

        void onSuccess(int i10);
    }

    private void onCancel(int i10) {
        IPreloadCallback iPreloadCallback = this.callback;
        if (iPreloadCallback != null) {
            iPreloadCallback.onCancel(i10);
        }
    }

    private void onFailed(int i10, String str) {
        IPreloadCallback iPreloadCallback = this.callback;
        if (iPreloadCallback != null) {
            iPreloadCallback.onFailed(i10, str);
        }
    }

    private void onSuccess(int i10) {
        IPreloadCallback iPreloadCallback;
        if (this.isCallbackSuccess || (iPreloadCallback = this.callback) == null) {
            return;
        }
        this.isCallbackSuccess = true;
        iPreloadCallback.onSuccess(i10);
    }

    private void printErrMsg(String str) {
        AdLog.e(PreloadManager.tag, str);
    }

    private void printErrMsg(String str, Throwable th2) {
        AdLog.e(PreloadManager.tag, str, th2);
    }

    private void printMsg(String str) {
        AdLog.i(PreloadManager.tag, str);
    }

    private void start(int i10) throws Throwable {
        StringBuilder sb2;
        HttpURLConnection httpURLConnection;
        if (blackList.contains(this.mRawUrl)) {
            onFailed(this.mPosition, "preload failed, in blackList");
            return;
        }
        String urlFileName = CoreUtils.getUrlFileName(this.mRawUrl);
        printMsg("预加载开始：" + urlFileName);
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                URL url = new URL(this.mCacheServer.k(this.mRawUrl));
                printMsg("url " + url);
                httpURLConnection = (HttpURLConnection) url.openConnection();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SocketTimeoutException unused) {
        } catch (Exception e10) {
            e = e10;
        }
        try {
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            byte[] bArr = new byte[8192];
            int i11 = -1;
            while (true) {
                int i12 = bufferedInputStream.read(bArr);
                if (i12 == -1) {
                    break;
                }
                i11 += i12;
                if (!this.mIsCanceled) {
                    if (!this.mIsAll && i11 >= 838860) {
                        printMsg("预加载成功：" + urlFileName + " 读取数据：" + i11 + " Byte");
                        onSuccess(this.mPosition);
                        break;
                    }
                } else {
                    printMsg("预加载取消：" + urlFileName + " 读取数据：" + i11 + " Byte");
                    onCancel(this.mPosition);
                    break;
                }
            }
            printMsg("预加载成功：" + urlFileName + " 读取数据：" + i11 + " Byte");
            onSuccess(this.mPosition);
            httpURLConnection.disconnect();
            sb2 = new StringBuilder();
        } catch (SocketTimeoutException unused2) {
            httpURLConnection2 = httpURLConnection;
            printErrMsg("预加载超时：" + urlFileName);
            if (i10 < 2) {
                printMsg("预加载重试，" + urlFileName);
                start(i10 + 1);
            }
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            sb2 = new StringBuilder();
        } catch (Exception e11) {
            e = e11;
            httpURLConnection2 = httpURLConnection;
            printErrMsg("预加载异常：" + urlFileName + " 异常信息：" + e.getMessage(), e);
            blackList.add(this.mRawUrl);
            onFailed(this.mPosition, "预加载异常：" + urlFileName + " 异常信息：" + e.getMessage());
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            sb2 = new StringBuilder();
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            printMsg("预加载结束: " + urlFileName);
            throw th;
        }
        sb2.append("预加载结束: ");
        sb2.append(urlFileName);
        printMsg(sb2.toString());
    }

    public void cancel() {
        if (this.mIsExecuted) {
            this.mIsCanceled = true;
        }
    }

    public void executeOn(ExecutorService executorService) {
        if (this.mIsExecuted) {
            return;
        }
        this.mIsExecuted = true;
        executorService.submit(this);
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        if (!this.mIsCanceled) {
            start(0);
        }
        this.mIsExecuted = false;
        this.mIsCanceled = false;
    }

    public void setCallback(IPreloadCallback iPreloadCallback) {
        this.callback = iPreloadCallback;
    }
}
