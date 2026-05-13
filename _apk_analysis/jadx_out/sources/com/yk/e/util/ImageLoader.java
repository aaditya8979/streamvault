package com.yk.e.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.work.Data;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.yk.e.net.TaskThreadPool;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public class ImageLoader {
    public Bitmap bitmap;
    public ImageLoadCallBack callBack;
    public Context context;
    public String imageUrl;
    public long startTime;
    private final int REQ_TIMES = 3;
    public Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.yk.e.util.ImageLoader.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ImageLoader.this.callBack();
                return false;
            }
            ImageLoader.this.callback4Gif();
            return false;
        }
    });

    public static abstract class ImageLoadCallBack {
        public abstract void execute(Bitmap bitmap);

        public void execute(GifDrawable gifDrawable) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callBack() {
        ImageLoadCallBack imageLoadCallBack = this.callBack;
        if (imageLoadCallBack != null) {
            imageLoadCallBack.execute(this.bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callback4Gif() {
    }

    @SuppressLint({"DefaultLocale"})
    private static String convertBytesToSize(long j10) {
        try {
            if (j10 < 1024) {
                return j10 + " B";
            }
            double d10 = j10;
            double d11 = 1024;
            int iLog = (int) (Math.log(d10) / Math.log(d11));
            return String.format("%.1f %sB", Double.valueOf(d10 / Math.pow(d11, iLog)), Character.valueOf("KMGTPE".charAt(iLog - 1)));
        } catch (Exception e10) {
            AdLog.e("convertBytesToSize error, msg = " + e10.getMessage(), e10);
            return "";
        }
    }

    private String getFileFormat(String str) {
        return str.substring(str.lastIndexOf("."));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String getImageFromNet() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yk.e.util.ImageLoader.getImageFromNet():java.lang.String");
    }

    public static boolean isFileExists(Context context, String str) {
        try {
            return context.getFileStreamPath(StringUtil.encryptToMD5(str)).exists();
        } catch (Exception e10) {
            LogUtil.printException(e10);
            return false;
        }
    }

    private GifDrawable loadGif4Url(Context context) {
        try {
            new BufferedInputStream(new FileInputStream(getImageFromNet()));
            return null;
        } catch (Exception e10) {
            LogUtil.printException(e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap loadImageFromUrl() throws Throwable {
        for (int i10 = 0; i10 < 3; i10++) {
            try {
                String imageFromNet = getImageFromNet();
                if (!TextUtils.isEmpty(imageFromNet)) {
                    return BitmapFactory.decodeStream(new FileInputStream(imageFromNet));
                }
            } catch (Exception e10) {
                LogUtil.printException(e10);
                return null;
            }
        }
        return null;
    }

    private byte[] readInputStream(InputStream inputStream) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Data.MAX_DATA_BYTES];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public Bitmap getBitmapFromLocal() {
        try {
            if (!isFileExists(this.context, this.imageUrl)) {
                return null;
            }
            return BitmapFactory.decodeStream(this.context.openFileInput(StringUtil.encryptToMD5(this.imageUrl)));
        } catch (Exception e10) {
            LogUtil.printException(e10);
            return null;
        }
    }

    public Bitmap getBitmapFromLocal(Context context, String str) {
        try {
            if (isFileExists(context, str)) {
                return BitmapFactory.decodeStream(context.openFileInput(StringUtil.encryptToMD5(str)));
            }
            return null;
        } catch (Exception e10) {
            LogUtil.printException(e10);
            return null;
        }
    }

    public GifDrawable getGifDrawable4Local(Context context, String str) {
        try {
            if (!isFileExists(context, str)) {
                return null;
            }
            String strEncryptToMD5 = StringUtil.encryptToMD5(str);
            AdLog.d("fileName " + strEncryptToMD5);
            new BufferedInputStream(context.openFileInput(strEncryptToMD5));
            return null;
        } catch (Exception e10) {
            LogUtil.e("getGifDrawable4Local error, msg = " + e10.getMessage(), e10);
            return null;
        }
    }

    public void loadImg(Context context, String str, ImageLoadCallBack imageLoadCallBack) {
        AdLog.d("imageUrl = " + str);
        this.callBack = imageLoadCallBack;
        if (TextUtils.isEmpty(str)) {
            callBack();
            return;
        }
        this.context = context;
        this.imageUrl = str;
        if (".gif".equals(getFileFormat(str).toLowerCase(Locale.ROOT))) {
            return;
        }
        Bitmap bitmapFromLocal = getBitmapFromLocal();
        this.bitmap = bitmapFromLocal;
        if (bitmapFromLocal != null) {
            AdLog.i("加载本地缓存图片");
            callBack();
        } else {
            AdLog.i("没有本地图片");
            this.startTime = System.currentTimeMillis();
            TaskThreadPool.executeRunnable(new Runnable() { // from class: com.yk.e.util.ImageLoader.2
                @Override // java.lang.Runnable
                public void run() {
                    ImageLoader imageLoader = ImageLoader.this;
                    imageLoader.bitmap = imageLoader.loadImageFromUrl();
                    ImageLoader.this.handler.sendEmptyMessage(1);
                }
            });
        }
    }
}
