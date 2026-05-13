package io.bidmachine.util;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.hardware.SensorManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.TypedValue;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.ColorRes;
import androidx.annotation.RequiresPermission;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import bn.r;
import bo.a0;
import bo.c;
import com.ironsource.C3978d4;
import com.ironsource.Ne;
import com.ironsource.Y5;
import com.ironsource.Z3;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import io.bidmachine.util.conversion.BooleanTypeConversion;
import io.bidmachine.util.conversion.DoubleTypeConversion;
import io.bidmachine.util.conversion.FloatTypeConversion;
import io.bidmachine.util.conversion.IntTypeConversion;
import io.bidmachine.util.conversion.LongTypeConversion;
import io.bidmachine.util.conversion.StringTypeConversion;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.Regex;
import on.b;
import on.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import sn.a;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000Æ\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0005\u001a\u001a\u0010\t\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u001a!\u0010\n\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\r\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019*\u00020\u0018\u001a\u0016\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u001c*\u00020\u001b\u001a\u000e\u0010\u001e\u001a\u00020\u0018*\u0006\u0012\u0002\b\u00030\u0019\u001a\u0012\u0010\u001f\u001a\u00020\u001b*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001c\u001a&\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000!2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"\u001a&\u0010&\u001a\u00020$\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000!2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"\u001a8\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010(*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001c\u001a8\u0010*\u001a\u00020$\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010(*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001c\u001a\n\u0010+\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010,\u001a\u00020\u0001*\u00020\u0001\u001a/\u00100\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010 *\u0004\u0018\u00010-*\b\u0012\u0004\u0012\u00028\u00000.2\b\u0010/\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b0\u00101\u001a\f\u00103\u001a\u0004\u0018\u00010\u0001*\u000202\u001a\u0012\u00106\u001a\u00020\u000f*\u0002022\u0006\u00105\u001a\u000204\u001a\f\u00108\u001a\u00020$*\u0004\u0018\u000107\u001a\f\u0010:\u001a\u00020$*\u0004\u0018\u000109\u001a\f\u0010<\u001a\u00020$*\u0004\u0018\u00010;\u001a\u000e\u0010>\u001a\u0004\u0018\u00010=*\u00020\u0000H\u0007\u001a\f\u0010@\u001a\u0004\u0018\u00010?*\u00020\u0000\u001a\f\u0010B\u001a\u0004\u0018\u00010A*\u00020\u0000\u001a\f\u0010D\u001a\u0004\u0018\u00010C*\u00020\u0000\u001a\f\u0010F\u001a\u0004\u0018\u00010E*\u00020\u0000\u001a\f\u0010H\u001a\u0004\u0018\u00010G*\u00020\u0000\u001a\f\u0010J\u001a\u0004\u0018\u00010I*\u00020\u0000\u001a\f\u0010L\u001a\u0004\u0018\u00010K*\u00020\u0000\u001a\f\u0010N\u001a\u0004\u0018\u00010M*\u00020\u0000\u001a\f\u0010P\u001a\u0004\u0018\u00010O*\u00020\u0000\u001a\f\u0010R\u001a\u0004\u0018\u00010Q*\u00020\u0000\u001a\f\u0010T\u001a\u0004\u0018\u00010S*\u00020\u0000\u001a&\u0010V\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010 \u0018\u0001*\u00020\u00002\u0006\u0010U\u001a\u00020\u0001H\u0082\b¢\u0006\u0004\bV\u0010W\u001a\u001a\u0010Z\u001a\u00020\f*\u00020\u00002\u0006\u0010X\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\u0012\u001a\u0012\u0010[\u001a\u00020\f*\u00020\u00002\u0006\u0010Y\u001a\u00020\u0012\u001a\u0012\u0010\\\u001a\u00020\f*\u00020\u00002\u0006\u0010Y\u001a\u00020\u0012\u001a\u0012\u0010]\u001a\u00020\f*\u00020\u00002\u0006\u0010Y\u001a\u00020\u0012\u001a\u0014\u0010_\u001a\u00020\f*\u00020\u00002\b\b\u0001\u0010^\u001a\u00020\f\u001a\u0014\u0010c\u001a\u0004\u0018\u00010b*\u00020\u00002\u0006\u0010a\u001a\u00020`\u001a\u001e\u0010f\u001a\u0004\u0018\u00010b*\u00020\u00002\u0006\u0010e\u001a\u00020d2\u0006\u0010a\u001a\u00020`H\u0007\u001a\n\u0010g\u001a\u00020\u0001*\u00020\u0007\u001a\u0014\u0010i\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0006\u0010h\u001a\u00020\u0001\u001a\u0014\u0010l\u001a\u0004\u0018\u00010\u0001*\u00020j2\u0006\u0010k\u001a\u00020\u0001\u001a\u0016\u0010n\u001a\u0004\u0018\u00010\u0005*\u00020\u00012\b\b\u0002\u0010m\u001a\u00020\f\u001a\u0016\u0010o\u001a\u0004\u0018\u00010\u0001*\u00020\u00052\b\b\u0002\u0010m\u001a\u00020\f\u001a\u0016\u0010n\u001a\u0004\u0018\u00010\u0005*\u00020\u00052\b\b\u0002\u0010m\u001a\u00020\f\u001a\u0016\u0010p\u001a\u0004\u0018\u00010\u0001*\u00020\u00052\b\b\u0002\u0010m\u001a\u00020\f\u001a\u0016\u0010p\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\b\b\u0002\u0010m\u001a\u00020\f\u001a+\u0010t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010q2\u000e\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000rH\u0086\bø\u0001\u0000¢\u0006\u0004\bt\u0010u\u001a;\u0010t\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010q*\u00028\u00002\u0014\u0010s\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010vH\u0086\bø\u0001\u0000¢\u0006\u0004\bt\u0010w\u001a#\u0010z\u001a\u00020\u0015\"\b\b\u0000\u0010 *\u00020x*\u00028\u00002\u0006\u0010y\u001a\u00020\u0015¢\u0006\u0004\bz\u0010{\u001a#\u0010z\u001a\u00020\u0012\"\b\b\u0000\u0010 *\u00020x*\u00028\u00002\u0006\u0010y\u001a\u00020\u0012¢\u0006\u0004\bz\u0010|\u001a#\u0010}\u001a\u00020\u0015\"\b\b\u0000\u0010 *\u00020x*\u00028\u00002\u0006\u0010y\u001a\u00020\u0015¢\u0006\u0004\b}\u0010{\u001a#\u0010}\u001a\u00020\u0012\"\b\b\u0000\u0010 *\u00020x*\u00028\u00002\u0006\u0010y\u001a\u00020\u0012¢\u0006\u0004\b}\u0010|\"\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001\"\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0090\u0001"}, d2 = {"Landroid/content/Context;", "", "permission", "", "isPermissionGranted", "", "applyMD5", "", "fallback", "toStringOrDefault", "toBooleanOrDefault", "(Ljava/lang/Object;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "", "toIntOrDefault", "(Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/Integer;", "", "toLongOrDefault", "(Ljava/lang/Object;Ljava/lang/Long;)Ljava/lang/Long;", "", "toFloatOrDefault", "(Ljava/lang/Object;Ljava/lang/Float;)Ljava/lang/Float;", "", "toDoubleOrDefault", "(Ljava/lang/Object;Ljava/lang/Double;)Ljava/lang/Double;", "Lorg/json/JSONArray;", "", "toList", "Lorg/json/JSONObject;", "", "toMap", "toJsonArray", "toJsonObject", "T", "", "", TypedValues.TransitionType.S_FROM, "Lbn/r;", "setSafely", "addAllSafely", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "putAllSafely", "toUnderScore", "toCamelCase", "Lio/bidmachine/util/KeyHolder;", "", "key", "find", "([Lio/bidmachine/util/KeyHolder;Ljava/lang/String;)Lio/bidmachine/util/KeyHolder;", "Ljava/io/InputStream;", "readSafely", "Ljava/io/File;", C3978d4.i.f31327b, "readIntoFile", "Ljava/io/Closeable;", "closeSafely", "Ljava/io/Flushable;", "flushSafely", "Ljava/io/OutputStream;", "finalize", "Landroid/location/Location;", "getLocation", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "Landroid/view/WindowManager;", "getWindowManager", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "Landroid/media/AudioManager;", "getAudioManager", "Landroid/os/PowerManager;", "getPowerManager", "Landroid/telephony/TelephonyManager;", "getTelephonyManager", "Landroid/location/LocationManager;", "getLocationManager", "Landroid/bluetooth/BluetoothManager;", "getBluetoothManager", "Landroid/app/DownloadManager;", "getDownloadManager", "Landroid/content/ClipboardManager;", "getClipboardManager", "Landroid/hardware/SensorManager;", "getSensorManager", "name", "getTypedSystemService", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;", Ne.f29954n1, "value", "unitToPx", "spToPx", "dpToPx", "pxToDp", "id", "getColorCompat", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/Intent;", "registerSystemReceiver", "Landroid/content/BroadcastReceiver;", "receiver", "registerBroadcastReceiver", "createHexHashCode", "defaultValue", "notEmptyOrDefault", "Landroid/content/res/AssetManager;", Y5.c.f30724b, "readAssetFile", "flags", "decodeBase64", "encodeToStringBase64", "decodeBase64ToString", "R", "Lkotlin/Function0;", "block", "letSafely", "(Lsn/a;)Ljava/lang/Object;", "Lkotlin/Function1;", "(Ljava/lang/Object;Lsn/l;)Ljava/lang/Object;", "", "max", "toRatio", "(Ljava/lang/Number;D)D", "(Ljava/lang/Number;F)F", "fromRatio", "Lio/bidmachine/util/conversion/StringTypeConversion;", "STRING_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/StringTypeConversion;", "Lio/bidmachine/util/conversion/BooleanTypeConversion;", "BOOLEAN_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/BooleanTypeConversion;", "Lio/bidmachine/util/conversion/IntTypeConversion;", "INT_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/IntTypeConversion;", "Lio/bidmachine/util/conversion/LongTypeConversion;", "LONG_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/LongTypeConversion;", "Lio/bidmachine/util/conversion/FloatTypeConversion;", "FLOAT_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/FloatTypeConversion;", "Lio/bidmachine/util/conversion/DoubleTypeConversion;", "DOUBLE_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/DoubleTypeConversion;", "bidmachine-android-util_d_0_13_0"}, k = 2, mv = {1, 7, 1})
public final class UtilsKt {

    @NotNull
    private static final StringTypeConversion STRING_TYPE_CONVERSION = new StringTypeConversion();

    @NotNull
    private static final BooleanTypeConversion BOOLEAN_TYPE_CONVERSION = new BooleanTypeConversion();

    @NotNull
    private static final IntTypeConversion INT_TYPE_CONVERSION = new IntTypeConversion();

    @NotNull
    private static final LongTypeConversion LONG_TYPE_CONVERSION = new LongTypeConversion();

    @NotNull
    private static final FloatTypeConversion FLOAT_TYPE_CONVERSION = new FloatTypeConversion();

    @NotNull
    private static final DoubleTypeConversion DOUBLE_TYPE_CONVERSION = new DoubleTypeConversion();

    public static final <T> void addAllSafely(@NotNull Collection<T> collection, @Nullable Collection<? extends T> collection2) {
        p.k(collection, "<this>");
        if (collection2 == null) {
            return;
        }
        collection.addAll(collection2);
    }

    @Nullable
    public static final byte[] applyMD5(@NotNull byte[] bArr) {
        p.k(bArr, "<this>");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void closeSafely(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
                r rVar = r.f5635a;
            } catch (Throwable unused) {
            }
        }
    }

    @NotNull
    public static final String createHexHashCode(@NotNull Object obj) {
        p.k(obj, "<this>");
        String hexString = Integer.toHexString(obj.hashCode());
        p.j(hexString, "toHexString(hashCode())");
        return hexString;
    }

    @Nullable
    public static final byte[] decodeBase64(@NotNull String str, int i10) {
        p.k(str, "<this>");
        try {
            byte[] bytes = str.getBytes(c.f5639b);
            p.j(bytes, "this as java.lang.String).getBytes(charset)");
            return decodeBase64(bytes, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final byte[] decodeBase64(@NotNull byte[] bArr, int i10) {
        p.k(bArr, "<this>");
        try {
            return Base64.decode(bArr, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ byte[] decodeBase64$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return decodeBase64(str, i10);
    }

    public static /* synthetic */ byte[] decodeBase64$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return decodeBase64(bArr, i10);
    }

    @Nullable
    public static final String decodeBase64ToString(@NotNull String str, int i10) {
        p.k(str, "<this>");
        byte[] bytes = str.getBytes(c.f5639b);
        p.j(bytes, "this as java.lang.String).getBytes(charset)");
        return decodeBase64ToString(bytes, i10);
    }

    @Nullable
    public static final String decodeBase64ToString(@NotNull byte[] bArr, int i10) {
        p.k(bArr, "<this>");
        byte[] bArrDecodeBase64 = decodeBase64(bArr, i10);
        if (bArrDecodeBase64 != null) {
            return new String(bArrDecodeBase64, c.f5639b);
        }
        return null;
    }

    public static /* synthetic */ String decodeBase64ToString$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return decodeBase64ToString(str, i10);
    }

    public static /* synthetic */ String decodeBase64ToString$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return decodeBase64ToString(bArr, i10);
    }

    public static final int dpToPx(@NotNull Context context, float f10) {
        p.k(context, "<this>");
        return unitToPx(context, 1, f10);
    }

    @Nullable
    public static final String encodeToStringBase64(@NotNull byte[] bArr, int i10) {
        p.k(bArr, "<this>");
        try {
            return Base64.encodeToString(bArr, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ String encodeToStringBase64$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return encodeToStringBase64(bArr, i10);
    }

    public static final void finalize(@Nullable OutputStream outputStream) {
        flushSafely(outputStream);
        closeSafely(outputStream);
    }

    @Nullable
    public static final <T extends KeyHolder> T find(@NotNull T[] tArr, @Nullable String str) {
        String lowerCase;
        String key;
        p.k(tArr, "<this>");
        if (str == null || str.length() == 0) {
            return null;
        }
        Locale locale = Locale.getDefault();
        p.j(locale, "getDefault()");
        String lowerCase2 = str.toLowerCase(locale);
        p.j(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        for (T t10 : tArr) {
            if (t10 == null || (key = t10.getKey()) == null) {
                lowerCase = null;
            } else {
                Locale locale2 = Locale.getDefault();
                p.j(locale2, "getDefault()");
                lowerCase = key.toLowerCase(locale2);
                p.j(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            if (a0.K(lowerCase, lowerCase2, false, 2, null)) {
                return t10;
            }
        }
        return null;
    }

    public static final void flushSafely(@Nullable Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
                r rVar = r.f5635a;
            } catch (Throwable unused) {
            }
        }
    }

    public static final <T extends Number> double fromRatio(@NotNull T t10, double d10) {
        p.k(t10, "<this>");
        return (d10 * t10.doubleValue()) / 1.0d;
    }

    public static final <T extends Number> float fromRatio(@NotNull T t10, float f10) {
        p.k(t10, "<this>");
        return (f10 * t10.floatValue()) / 1.0f;
    }

    @Nullable
    public static final AudioManager getAudioManager(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            Object systemService = context.getSystemService("audio");
            if (!(systemService instanceof AudioManager)) {
                systemService = null;
            }
            return (AudioManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final BluetoothManager getBluetoothManager(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            Object systemService = context.getSystemService(Z3.f30765d);
            if (!(systemService instanceof BluetoothManager)) {
                systemService = null;
            }
            return (BluetoothManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final ClipboardManager getClipboardManager(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            Object systemService = context.getSystemService("clipboard");
            if (!(systemService instanceof ClipboardManager)) {
                systemService = null;
            }
            return (ClipboardManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final int getColorCompat(@NotNull Context context, @ColorRes int i10) {
        p.k(context, "<this>");
        return context.getColor(i10);
    }

    @Nullable
    public static final ConnectivityManager getConnectivityManager(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (!(systemService instanceof ConnectivityManager)) {
                systemService = null;
            }
            return (ConnectivityManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final DownloadManager getDownloadManager(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            Object systemService = context.getSystemService(NativeAdPresenter.DOWNLOAD);
            if (!(systemService instanceof DownloadManager)) {
                systemService = null;
            }
            return (DownloadManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final InputMethodManager getInputMethodManager(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            Object systemService = context.getSystemService("input_method");
            if (!(systemService instanceof InputMethodManager)) {
                systemService = null;
            }
            return (InputMethodManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_COARSE_LOCATION")
    @Nullable
    public static final Location getLocation(@NotNull Context context) {
        LocationManager locationManager;
        Location lastKnownLocation;
        p.k(context, "<this>");
        try {
            if (!isPermissionGranted(context, "android.permission.ACCESS_COARSE_LOCATION") || (locationManager = getLocationManager(context)) == null) {
                return null;
            }
            String bestProvider = Build.VERSION.SDK_INT >= 34 ? GplLibraryWrapper.FUSED_PROVIDER : locationManager.getBestProvider(new Criteria(), false);
            if (bestProvider == null) {
                return null;
            }
            Location lastKnownLocation2 = locationManager.getLastKnownLocation(bestProvider);
            if (lastKnownLocation2 != null) {
                return lastKnownLocation2;
            }
            List<String> allProviders = locationManager.getAllProviders();
            p.j(allProviders, "locationManager.allProviders");
            if (allProviders.size() <= 1) {
                return null;
            }
            for (String str : allProviders) {
                if (str != null && !p.f(str, bestProvider) && (lastKnownLocation = locationManager.getLastKnownLocation(str)) != null) {
                    return lastKnownLocation;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Nullable
    public static final LocationManager getLocationManager(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            Object systemService = context.getSystemService("location");
            if (!(systemService instanceof LocationManager)) {
                systemService = null;
            }
            return (LocationManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final PowerManager getPowerManager(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            Object systemService = context.getSystemService("power");
            if (!(systemService instanceof PowerManager)) {
                systemService = null;
            }
            return (PowerManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final SensorManager getSensorManager(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            Object systemService = context.getSystemService("sensor");
            if (!(systemService instanceof SensorManager)) {
                systemService = null;
            }
            return (SensorManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final TelephonyManager getTelephonyManager(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            Object systemService = context.getSystemService("phone");
            if (!(systemService instanceof TelephonyManager)) {
                systemService = null;
            }
            return (TelephonyManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static final /* synthetic */ <T> T getTypedSystemService(Context context, String str) {
        try {
            T t10 = (T) context.getSystemService(str);
            p.q(2, "T");
            return t10;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final WindowManager getWindowManager(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            Object systemService = context.getSystemService("window");
            if (!(systemService instanceof WindowManager)) {
                systemService = null;
            }
            return (WindowManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean isPermissionGranted(@NotNull Context context, @Nullable String str) {
        Boolean boolValueOf;
        p.k(context, "<this>");
        boolean z10 = true;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            if (context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                z10 = false;
            }
            boolValueOf = Boolean.valueOf(z10);
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        return p.f(boolValueOf, Boolean.TRUE);
    }

    @Nullable
    public static final <T, R> R letSafely(T t10, @NotNull l<? super T, ? extends R> lVar) {
        p.k(lVar, "block");
        try {
            return lVar.invoke(t10);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final <R> R letSafely(@NotNull a<? extends R> aVar) {
        p.k(aVar, "block");
        try {
            return aVar.invoke();
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public static final String notEmptyOrDefault(@Nullable String str, @NotNull String str2) {
        p.k(str2, "defaultValue");
        return str == null || str.length() == 0 ? str2 : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> void putAllSafely(@NotNull Map<K, V> map, @Nullable Map<K, ? extends V> map2) {
        p.k(map, "<this>");
        if (map2 == 0) {
            return;
        }
        map.putAll(map2);
    }

    public static final int pxToDp(@NotNull Context context, float f10) {
        p.k(context, "<this>");
        return Utils.pxToDp(DeviceUtilsKt.getScreenDensity(context), f10);
    }

    @Nullable
    public static final String readAssetFile(@NotNull AssetManager assetManager, @NotNull String str) {
        p.k(assetManager, "<this>");
        p.k(str, Y5.c.f30724b);
        try {
            InputStream inputStreamOpen = assetManager.open(str);
            p.j(inputStreamOpen, "open(fileName)");
            return readSafely(inputStreamOpen);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final long readIntoFile(@NotNull InputStream inputStream, @NotNull File file) throws Throwable {
        p.k(inputStream, "<this>");
        p.k(file, C3978d4.i.f31327b);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                long jB = on.a.b(inputStream, fileOutputStream, 0, 2, null);
                b.a(fileOutputStream, null);
                b.a(inputStream, null);
                return jB;
            } finally {
            }
        } finally {
        }
    }

    @Nullable
    public static final String readSafely(@NotNull InputStream inputStream) {
        p.k(inputStream, "<this>");
        try {
            try {
                Reader inputStreamReader = new InputStreamReader(inputStream, c.f5639b);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    String strE = k.e(bufferedReader);
                    b.a(bufferedReader, null);
                    b.a(inputStream, null);
                    return strE;
                } finally {
                }
            } catch (Throwable unused) {
                return null;
            }
        } finally {
        }
    }

    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    @Nullable
    public static final Intent registerBroadcastReceiver(@NotNull Context context, @NotNull BroadcastReceiver broadcastReceiver, @NotNull IntentFilter intentFilter) {
        p.k(context, "<this>");
        p.k(broadcastReceiver, "receiver");
        p.k(intentFilter, "intentFilter");
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, 2) : context.registerReceiver(broadcastReceiver, intentFilter);
    }

    @Nullable
    public static final Intent registerSystemReceiver(@NotNull Context context, @NotNull IntentFilter intentFilter) {
        p.k(context, "<this>");
        p.k(intentFilter, "intentFilter");
        return Build.VERSION.SDK_INT >= 34 ? context.registerReceiver(null, intentFilter, 4) : context.registerReceiver(null, intentFilter);
    }

    public static final <T> void setSafely(@NotNull Collection<T> collection, @Nullable Collection<? extends T> collection2) {
        p.k(collection, "<this>");
        collection.clear();
        addAllSafely(collection, collection2);
    }

    public static final <K, V> void setSafely(@NotNull Map<K, V> map, @Nullable Map<K, ? extends V> map2) {
        p.k(map, "<this>");
        map.clear();
        putAllSafely(map, map2);
    }

    public static final int spToPx(@NotNull Context context, float f10) {
        p.k(context, "<this>");
        return unitToPx(context, 2, f10);
    }

    @Nullable
    public static final Boolean toBooleanOrDefault(@Nullable Object obj, @Nullable Boolean bool) {
        return BOOLEAN_TYPE_CONVERSION.toOrDefault(obj, bool);
    }

    public static /* synthetic */ Boolean toBooleanOrDefault$default(Object obj, Boolean bool, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            bool = null;
        }
        return toBooleanOrDefault(obj, bool);
    }

    @NotNull
    public static final String toCamelCase(@NotNull String str) {
        p.k(str, "<this>");
        String strReplace = new Regex("_([a-z])").replace(str, new l<bo.l, CharSequence>() { // from class: io.bidmachine.util.UtilsKt.toCamelCase.1
            @Override // sn.l
            @NotNull
            public final CharSequence invoke(@NotNull bo.l lVar) {
                p.k(lVar, "it");
                String upperCase = lVar.b().get(1).toUpperCase(Locale.ROOT);
                p.j(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                return upperCase;
            }
        });
        if (!(strReplace.length() > 0)) {
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = strReplace.charAt(0);
        Locale locale = Locale.getDefault();
        p.j(locale, "getDefault()");
        sb2.append((Object) bo.a.d(cCharAt, locale));
        String strSubstring = strReplace.substring(1);
        p.j(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    @Nullable
    public static final Double toDoubleOrDefault(@Nullable Object obj, @Nullable Double d10) {
        return DOUBLE_TYPE_CONVERSION.toOrDefault(obj, d10);
    }

    public static /* synthetic */ Double toDoubleOrDefault$default(Object obj, Double d10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            d10 = null;
        }
        return toDoubleOrDefault(obj, d10);
    }

    @Nullable
    public static final Float toFloatOrDefault(@Nullable Object obj, @Nullable Float f10) {
        return FLOAT_TYPE_CONVERSION.toOrDefault(obj, f10);
    }

    public static /* synthetic */ Float toFloatOrDefault$default(Object obj, Float f10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        return toFloatOrDefault(obj, f10);
    }

    @Nullable
    public static final Integer toIntOrDefault(@Nullable Object obj, @Nullable Integer num) {
        return INT_TYPE_CONVERSION.toOrDefault(obj, num);
    }

    public static /* synthetic */ Integer toIntOrDefault$default(Object obj, Integer num, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        return toIntOrDefault(obj, num);
    }

    @NotNull
    public static final JSONArray toJsonArray(@NotNull List<?> list) {
        p.k(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object objFromObjectToJsonElementOrNull = Utils.fromObjectToJsonElementOrNull(it.next());
            if (objFromObjectToJsonElementOrNull != null) {
                jSONArray.put(objFromObjectToJsonElementOrNull);
            }
        }
        return jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final org.json.JSONObject toJsonObject(@org.jetbrains.annotations.NotNull java.util.Map<?, ?> r6) throws org.json.JSONException {
        /*
            java.lang.String r0 = "<this>"
            tn.p.k(r6, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L12:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            if (r2 == 0) goto L29
            java.lang.String r2 = r2.toString()
            goto L2a
        L29:
            r2 = 0
        L2a:
            java.lang.Object r1 = r1.getValue()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            int r5 = r2.length()
            if (r5 <= 0) goto L3a
            r5 = r3
            goto L3b
        L3a:
            r5 = r4
        L3b:
            if (r5 != r3) goto L3e
            goto L3f
        L3e:
            r3 = r4
        L3f:
            if (r3 == 0) goto L12
            if (r1 == 0) goto L12
            java.lang.Object r1 = io.bidmachine.util.Utils.fromObjectToJsonElementOrNull(r1)
            if (r1 == 0) goto L12
            r0.put(r2, r1)
            goto L12
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.util.UtilsKt.toJsonObject(java.util.Map):org.json.JSONObject");
    }

    @NotNull
    public static final List<Object> toList(@NotNull JSONArray jSONArray) {
        p.k(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object objFromJsonElementToObjectOrNull = Utils.fromJsonElementToObjectOrNull(jSONArray.opt(i10));
            if (objFromJsonElementToObjectOrNull != null) {
                arrayList.add(objFromJsonElementToObjectOrNull);
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Long toLongOrDefault(@Nullable Object obj, @Nullable Long l10) {
        return LONG_TYPE_CONVERSION.toOrDefault(obj, l10);
    }

    public static /* synthetic */ Long toLongOrDefault$default(Object obj, Long l10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        return toLongOrDefault(obj, l10);
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull JSONObject jSONObject) {
        p.k(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        p.j(itKeys, "keys()");
        for (String str : ao.r.g(itKeys)) {
            Object objFromJsonElementToObjectOrNull = Utils.fromJsonElementToObjectOrNull(jSONObject.opt(str));
            if (objFromJsonElementToObjectOrNull != null) {
                p.j(str, "key");
                linkedHashMap.put(str, objFromJsonElementToObjectOrNull);
            }
        }
        return linkedHashMap;
    }

    public static final <T extends Number> double toRatio(@NotNull T t10, double d10) {
        p.k(t10, "<this>");
        return ((double) vn.c.c((t10.doubleValue() / d10) * ((double) 100))) / 100.0d;
    }

    public static final <T extends Number> float toRatio(@NotNull T t10, float f10) {
        p.k(t10, "<this>");
        return vn.c.d((t10.floatValue() / f10) * 100) / 100.0f;
    }

    @Nullable
    public static final String toStringOrDefault(@Nullable Object obj, @Nullable String str) {
        return STRING_TYPE_CONVERSION.toOrDefault(obj, str);
    }

    public static /* synthetic */ String toStringOrDefault$default(Object obj, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return toStringOrDefault(obj, str);
    }

    @NotNull
    public static final String toUnderScore(@NotNull String str) {
        p.k(str, "<this>");
        String strReplace = new Regex("(?<=.)[A-Z]").replace(str, "_$0");
        Locale locale = Locale.getDefault();
        p.j(locale, "getDefault()");
        String lowerCase = strReplace.toLowerCase(locale);
        p.j(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public static final int unitToPx(@NotNull Context context, int i10, float f10) {
        p.k(context, "<this>");
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) TypedValue.applyDimension(i10, f10, DeviceUtilsKt.getDisplayMetrics(context));
    }
}
