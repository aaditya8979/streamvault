package io.bidmachine;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.XmlResourceParser;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes4.dex */
public final class PlatformData {

    @Nullable
    private static volatile PlatformData instance;

    @NonNull
    private final Context context;

    @Nullable
    public final String kotlinVersion = getKotlinVersion();

    @Nullable
    private Integer minSdkVersion;

    private PlatformData(@NonNull Context context) {
        this.context = context.getApplicationContext();
    }

    @NonNull
    public static PlatformData get(@NonNull Context context) {
        PlatformData platformData = instance;
        if (platformData == null) {
            synchronized (PlatformData.class) {
                platformData = instance;
                if (platformData == null) {
                    platformData = new PlatformData(context);
                    instance = platformData;
                }
            }
        }
        return platformData;
    }

    @Nullable
    private String getKotlinVersion() {
        try {
            return KotlinVersion.CURRENT.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    @RequiresApi(api = 24)
    private Integer getMinSdkVersionFromApplicationInfo(@NonNull Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
            if (applicationInfo != null) {
                return Integer.valueOf(applicationInfo.minSdkVersion);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    private Integer getMinSdkVersionFromManifest(@NonNull Context context) {
        Integer numValueOf = null;
        try {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            try {
                for (int eventType = xmlResourceParserOpenXmlResourceParser.getEventType(); eventType != 1; eventType = xmlResourceParserOpenXmlResourceParser.next()) {
                    if (eventType == 2) {
                        if ("uses-sdk".equals(xmlResourceParserOpenXmlResourceParser.getName())) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= xmlResourceParserOpenXmlResourceParser.getAttributeCount()) {
                                    break;
                                }
                                if ("minSdkVersion".equals(xmlResourceParserOpenXmlResourceParser.getAttributeName(i10))) {
                                    numValueOf = Integer.valueOf(Integer.parseInt(xmlResourceParserOpenXmlResourceParser.getAttributeValue(i10)));
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                }
                xmlResourceParserOpenXmlResourceParser.close();
            } finally {
            }
        } catch (Exception unused) {
        }
        return numValueOf;
    }

    @Nullable
    public Integer getMinSdkVersion() {
        Integer num = this.minSdkVersion;
        if (num != null) {
            return num;
        }
        Integer minSdkVersionFromApplicationInfo = getMinSdkVersionFromApplicationInfo(this.context);
        this.minSdkVersion = minSdkVersionFromApplicationInfo;
        if (minSdkVersionFromApplicationInfo == null) {
            this.minSdkVersion = getMinSdkVersionFromManifest(this.context);
        }
        return this.minSdkVersion;
    }
}
