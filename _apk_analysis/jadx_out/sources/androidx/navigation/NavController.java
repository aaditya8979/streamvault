package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import bn.g;
import bn.h;
import bn.r;
import cn.b0;
import cn.f0;
import cn.m;
import cn.w;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.vungle.ads.internal.ui.AdActivity;
import go.d;
import go.f;
import go.k;
import go.l;
import go.q;
import go.u;
import go.v;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import tn.y;

/* JADX INFO: compiled from: NavController.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Ú\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0016\u0018\u0000 Þ\u00012\u00020\u0001:\u0006Þ\u0001ß\u0001à\u0001B\u0011\u0012\u0006\u0010o\u001a\u00020n¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002JL\u0010\u0011\u001a\u00020\u0005*\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u000fH\u0002J:\u0010\u0015\u001a\u00020\u0005*\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u000fH\u0002J$\u0010\u0015\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003J*\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u0012\u0010\u001d\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0003J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002J\b\u0010 \u001a\u00020\u0013H\u0002J\u0012\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010!H\u0003J\u0012\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010%\u001a\u00020$H\u0002J\u0018\u0010(\u001a\u0004\u0018\u00010\b*\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0002J.\u0010+\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010!2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003J.\u0010-\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010!2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0002J2\u00103\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010!2\u0006\u00101\u001a\u00020\u00022\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002J\b\u00104\u001a\u00020\u0005H\u0002J\u0019\u00107\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b5\u00106J\u0010\u0010:\u001a\u00020\u00052\u0006\u00109\u001a\u000208H\u0016J\u0010\u0010;\u001a\u00020\u00052\u0006\u00109\u001a\u000208H\u0016J\b\u0010<\u001a\u00020\u0013H\u0017J\u001a\u0010<\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0017J\"\u0010<\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J\"\u0010<\u001a\u00020\u00132\u0006\u0010=\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007J%\u0010B\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050>H\u0000¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020\u00132\u0006\u0010=\u001a\u00020&H\u0007J\u0012\u0010C\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0007J\b\u0010D\u001a\u00020\u0013H\u0017J\u000f\u0010G\u001a\u00020\u0005H\u0000¢\u0006\u0004\bE\u0010FJ\u0015\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0000¢\u0006\u0004\bH\u0010IJ\u0012\u0010L\u001a\u00020\u00052\b\b\u0001\u0010K\u001a\u00020\u0016H\u0017J\u001c\u0010L\u001a\u00020\u00052\b\b\u0001\u0010K\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017J\u001a\u0010L\u001a\u00020\u00052\u0006\u0010N\u001a\u00020M2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017J\u0012\u0010Q\u001a\u00020\u00132\b\u0010P\u001a\u0004\u0018\u00010OH\u0017J\u0014\u0010(\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0007J\u0012\u0010(\u001a\u0004\u0018\u00010\b2\u0006\u0010R\u001a\u00020&H\u0007J\u0012\u0010+\u001a\u00020\u00052\b\b\u0001\u0010S\u001a\u00020\u0016H\u0017J\u001c\u0010+\u001a\u00020\u00052\b\b\u0001\u0010S\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010!H\u0017J&\u0010+\u001a\u00020\u00052\b\b\u0001\u0010S\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010!2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J0\u0010+\u001a\u00020\u00052\b\b\u0001\u0010S\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010!2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010%\u001a\u00020TH\u0017J\u001a\u0010+\u001a\u00020\u00052\u0006\u0010%\u001a\u00020T2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J$\u0010+\u001a\u00020\u00052\u0006\u0010%\u001a\u00020T2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010V\u001a\u00020UH\u0017J\u001a\u0010+\u001a\u00020\u00052\u0006\u0010V\u001a\u00020U2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J$\u0010+\u001a\u00020\u00052\u0006\u0010V\u001a\u00020U2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010X\u001a\u00020WH\u0017J\u001a\u0010+\u001a\u00020\u00052\u0006\u0010X\u001a\u00020W2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J\u0018\u0010+\u001a\u00020\u00052\u0006\u0010X\u001a\u00020W2\u0006\u0010\u000e\u001a\u00020\rH\u0017J\"\u0010+\u001a\u00020\u00052\u0006\u0010=\u001a\u00020&2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u00050\u000fJ(\u0010+\u001a\u00020\u00052\u0006\u0010=\u001a\u00020&2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\b\u0010\\\u001a\u00020[H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010!H\u0017J\u0012\u0010^\u001a\u00020\u00052\b\u0010]\u001a\u0004\u0018\u00010!H\u0017J\u0010\u0010a\u001a\u00020\u00052\u0006\u0010`\u001a\u00020_H\u0017J\u0010\u0010d\u001a\u00020\u00052\u0006\u0010c\u001a\u00020bH\u0017J\u0010\u0010f\u001a\u00020\u00052\u0006\u0010e\u001a\u00020\u0013H\u0017J\u0010\u0010i\u001a\u00020\u00052\u0006\u0010h\u001a\u00020gH\u0017J\u0012\u0010l\u001a\u00020k2\b\b\u0001\u0010j\u001a\u00020\u0016H\u0016J\u0012\u0010m\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0016J\u000e\u0010m\u001a\u00020\u00022\u0006\u0010=\u001a\u00020&R\u0017\u0010o\u001a\u00020n8\u0007¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010w\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010y\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010{\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u001f\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020~\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u0081\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R%\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198WX\u0096\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R$\u0010\u0088\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R)\u0010\u008b\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u008a\u00018\u0006¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R$\u0010\u0090\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R%\u0010\u0093\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u0092\u00010\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0091\u0001R&\u0010\u0094\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010&0\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0091\u0001R*\u0010\u0095\u0001\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0091\u0001R\u001b\u0010\u0096\u0001\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001e\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u0002080\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¡\u0001\u001a\u00030 \u00018@@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010«\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u0082\u0001R\u001a\u0010¯\u0001\u001a\u00030®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R1\u0010²\u0001\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\t\u0012\u00070±\u0001R\u00020\u00000\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010\u0091\u0001R'\u0010³\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R'\u0010µ\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010´\u0001R$\u0010¶\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010\u0091\u0001R\u0019\u0010·\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u001e\u0010º\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020¹\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R \u0010À\u0001\u001a\u00020v8VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001R\u001e\u0010Â\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R#\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020Ä\u00018\u0006¢\u0006\u0010\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0017\u0010Ë\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R'\u0010N\u001a\u00020M2\u0006\u0010N\u001a\u00020M8W@WX\u0096\u000e¢\u0006\u000f\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0005\bL\u0010Î\u0001R,\u0010Ï\u0001\u001a\u00030®\u00012\b\u0010Ï\u0001\u001a\u00030®\u00018V@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R\u0019\u0010Ö\u0001\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0019\u0010Ù\u0001\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b×\u0001\u0010Ø\u0001R\u0019\u0010Û\u0001\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Ø\u0001¨\u0006á\u0001"}, d2 = {"Landroidx/navigation/NavController;", "", "Landroidx/navigation/NavBackStackEntry;", "child", "parent", "Lbn/r;", "linkChildToParent", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "Lkotlin/Function1;", "handler", "navigateInternal", "popUpTo", "", "saveState", "popBackStackInternal", "", "destinationId", "inclusive", "Lcn/m;", "Landroidx/navigation/NavBackStackEntryState;", "savedState", "popEntryFromBackStack", "clearBackStackInternal", "tryRelaunchUpToExplicitStack", "tryRelaunchUpToGeneratedStack", "dispatchOnDestinationChanged", "Landroid/os/Bundle;", "startDestinationArgs", "onGraphCreated", "", "deepLink", "", "findInvalidDestinationDisplayNameInDeepLink", "findDestination", "node", "args", "navigate", "id", "restoreStateInternal", "backStackState", "instantiateBackStack", "finalArgs", "backStackEntry", "restoredEntries", "addEntryToBackStack", "updateOnBackPressedCallbackEnabled", "unlinkChildFromParent$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/navigation/NavBackStackEntry;", "unlinkChildFromParent", "Landroidx/navigation/NavController$OnDestinationChangedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnDestinationChangedListener", "removeOnDestinationChangedListener", "popBackStack", "route", "Lkotlin/Function0;", "onComplete", "popBackStackFromNavigator$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;Lsn/a;)V", "popBackStackFromNavigator", "clearBackStack", "navigateUp", "updateBackStackLifecycle$navigation_runtime_release", "()V", "updateBackStackLifecycle", "populateVisibleEntries$navigation_runtime_release", "()Ljava/util/List;", "populateVisibleEntries", "graphResId", "setGraph", "Landroidx/navigation/NavGraph;", "graph", "Landroid/content/Intent;", "intent", "handleDeepLink", "destinationRoute", "resId", "Landroid/net/Uri;", "Landroidx/navigation/NavDeepLinkRequest;", AdActivity.REQUEST_KEY_EXTRA, "Landroidx/navigation/NavDirections;", "directions", "Landroidx/navigation/NavOptionsBuilder;", "builder", "Landroidx/navigation/NavDeepLinkBuilder;", "createDeepLink", "navState", "restoreState", "Landroidx/lifecycle/LifecycleOwner;", "owner", "setLifecycleOwner", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "setOnBackPressedDispatcher", "enabled", "enableOnBackPressed", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "setViewModelStore", "navGraphId", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner", "getBackStackEntry", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "Landroidx/navigation/NavInflater;", "inflater", "Landroidx/navigation/NavInflater;", "_graph", "Landroidx/navigation/NavGraph;", "navigatorStateToRestore", "Landroid/os/Bundle;", "", "Landroid/os/Parcelable;", "backStackToRestore", "[Landroid/os/Parcelable;", "deepLinkHandled", "Z", "backQueue", "Lcn/m;", "getBackQueue", "()Lcn/m;", "Lgo/l;", "_visibleEntries", "Lgo/l;", "Lgo/u;", "visibleEntries", "Lgo/u;", "getVisibleEntries", "()Lgo/u;", "", "childToParentEntries", "Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicInteger;", "parentToChildCount", "backStackMap", "backStackStates", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/navigation/NavControllerViewModel;", "viewModel", "Landroidx/navigation/NavControllerViewModel;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onDestinationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "getHostLifecycleState$navigation_runtime_release", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleObserver;", "lifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "enableOnBackPressedCallback", "Landroidx/navigation/NavigatorProvider;", "_navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "Landroidx/navigation/NavController$NavControllerNavigatorState;", "navigatorState", "addToBackStackHandler", "Lsn/l;", "popFromBackStackHandler", "entrySavedState", "dispatchReentrantCount", "I", "", "backStackEntriesToDispatch", "Ljava/util/List;", "navInflater$delegate", "Lbn/g;", "getNavInflater", "()Landroidx/navigation/NavInflater;", "navInflater", "Lgo/k;", "_currentBackStackEntryFlow", "Lgo/k;", "Lgo/d;", "currentBackStackEntryFlow", "Lgo/d;", "getCurrentBackStackEntryFlow", "()Lgo/d;", "getDestinationCountOnBackStack", "()I", "destinationCountOnBackStack", "getGraph", "()Landroidx/navigation/NavGraph;", "(Landroidx/navigation/NavGraph;)V", "navigatorProvider", "getNavigatorProvider", "()Landroidx/navigation/NavigatorProvider;", "setNavigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "getCurrentDestination", "()Landroidx/navigation/NavDestination;", "currentDestination", "getCurrentBackStackEntry", "()Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntry", "getPreviousBackStackEntry", "previousBackStackEntry", "<init>", "(Landroid/content/Context;)V", VastTagName.COMPANION, "NavControllerNavigatorState", "OnDestinationChangedListener", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0})
public class NavController {

    @NotNull
    private static final String KEY_BACK_STACK = "android-support-nav:controller:backStack";

    @NotNull
    private static final String KEY_BACK_STACK_DEST_IDS = "android-support-nav:controller:backStackDestIds";

    @NotNull
    private static final String KEY_BACK_STACK_IDS = "android-support-nav:controller:backStackIds";

    @NotNull
    private static final String KEY_BACK_STACK_STATES_IDS = "android-support-nav:controller:backStackStates";

    @NotNull
    private static final String KEY_BACK_STACK_STATES_PREFIX = "android-support-nav:controller:backStackStates:";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_ARGS = "android-support-nav:controller:deepLinkArgs";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";

    @NotNull
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";

    @NotNull
    private static final String KEY_NAVIGATOR_STATE = "android-support-nav:controller:navigatorState";

    @NotNull
    private static final String KEY_NAVIGATOR_STATE_NAMES = "android-support-nav:controller:navigatorState:names";

    @NotNull
    private static final String TAG = "NavController";

    @NotNull
    private final k<NavBackStackEntry> _currentBackStackEntryFlow;

    @Nullable
    private NavGraph _graph;

    @NotNull
    private NavigatorProvider _navigatorProvider;

    @NotNull
    private final l<List<NavBackStackEntry>> _visibleEntries;

    @Nullable
    private Activity activity;

    @Nullable
    private sn.l<? super NavBackStackEntry, r> addToBackStackHandler;

    @NotNull
    private final m<NavBackStackEntry> backQueue;

    @NotNull
    private final List<NavBackStackEntry> backStackEntriesToDispatch;

    @NotNull
    private final Map<Integer, String> backStackMap;

    @NotNull
    private final Map<String, m<NavBackStackEntryState>> backStackStates;

    @Nullable
    private Parcelable[] backStackToRestore;

    @NotNull
    private final Map<NavBackStackEntry, NavBackStackEntry> childToParentEntries;

    @NotNull
    private final Context context;

    @NotNull
    private final d<NavBackStackEntry> currentBackStackEntryFlow;
    private boolean deepLinkHandled;
    private int dispatchReentrantCount;
    private boolean enableOnBackPressedCallback;

    @NotNull
    private final Map<NavBackStackEntry, Boolean> entrySavedState;

    @NotNull
    private Lifecycle.State hostLifecycleState;

    @Nullable
    private NavInflater inflater;

    @NotNull
    private final LifecycleObserver lifecycleObserver;

    @Nullable
    private LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: navInflater$delegate, reason: from kotlin metadata */
    @NotNull
    private final g navInflater;

    @NotNull
    private final Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> navigatorState;

    @Nullable
    private Bundle navigatorStateToRestore;

    @NotNull
    private final OnBackPressedCallback onBackPressedCallback;

    @Nullable
    private OnBackPressedDispatcher onBackPressedDispatcher;

    @NotNull
    private final CopyOnWriteArrayList<OnDestinationChangedListener> onDestinationChangedListeners;

    @NotNull
    private final Map<NavBackStackEntry, AtomicInteger> parentToChildCount;

    @Nullable
    private sn.l<? super NavBackStackEntry, r> popFromBackStackHandler;

    @Nullable
    private NavControllerViewModel viewModel;

    @NotNull
    private final u<List<NavBackStackEntry>> visibleEntries;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean deepLinkSaveState = true;

    /* JADX INFO: compiled from: NavController.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087T¢\u0006\f\n\u0004\b\u000e\u0010\b\u0012\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/navigation/NavController$Companion;", "", "", "saveState", "Lbn/r;", "enableDeepLinkSaveState", "", "KEY_BACK_STACK", "Ljava/lang/String;", "KEY_BACK_STACK_DEST_IDS", "KEY_BACK_STACK_IDS", "KEY_BACK_STACK_STATES_IDS", "KEY_BACK_STACK_STATES_PREFIX", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_EXTRAS", "getKEY_DEEP_LINK_EXTRAS$annotations", "()V", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_IDS", "KEY_DEEP_LINK_INTENT", "KEY_NAVIGATOR_STATE", "KEY_NAVIGATOR_STATE_NAMES", "TAG", "deepLinkSaveState", "Z", "<init>", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static /* synthetic */ void getKEY_DEEP_LINK_EXTRAS$annotations() {
        }

        @NavDeepLinkSaveStateControl
        public final void enableDeepLinkSaveState(boolean z10) {
            NavController.deepLinkSaveState = z10;
        }
    }

    /* JADX INFO: compiled from: NavController.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u001f\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/navigation/NavController$NavControllerNavigatorState;", "Landroidx/navigation/NavigatorState;", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "Lbn/r;", "push", "addInternal", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "createBackStackEntry", "popUpTo", "", "saveState", "pop", "popWithTransition", "entry", "markTransitionComplete", "Landroidx/navigation/Navigator;", "navigator", "Landroidx/navigation/Navigator;", "getNavigator", "()Landroidx/navigation/Navigator;", "<init>", "(Landroidx/navigation/NavController;Landroidx/navigation/Navigator;)V", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0})
    public final class NavControllerNavigatorState extends NavigatorState {

        @NotNull
        private final Navigator<? extends NavDestination> navigator;
        public final /* synthetic */ NavController this$0;

        public NavControllerNavigatorState(@NotNull NavController navController, Navigator<? extends NavDestination> navigator) {
            p.k(navigator, "navigator");
            this.this$0 = navController;
            this.navigator = navigator;
        }

        public final void addInternal(@NotNull NavBackStackEntry navBackStackEntry) {
            p.k(navBackStackEntry, "backStackEntry");
            super.push(navBackStackEntry);
        }

        @Override // androidx.navigation.NavigatorState
        @NotNull
        public NavBackStackEntry createBackStackEntry(@NotNull NavDestination destination, @Nullable Bundle arguments) {
            p.k(destination, "destination");
            return NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, this.this$0.getContext(), destination, arguments, this.this$0.getHostLifecycleState$navigation_runtime_release(), this.this$0.viewModel, null, null, 96, null);
        }

        @NotNull
        public final Navigator<? extends NavDestination> getNavigator() {
            return this.navigator;
        }

        @Override // androidx.navigation.NavigatorState
        public void markTransitionComplete(@NotNull NavBackStackEntry navBackStackEntry) {
            NavControllerViewModel navControllerViewModel;
            p.k(navBackStackEntry, "entry");
            boolean zF = p.f(this.this$0.entrySavedState.get(navBackStackEntry), Boolean.TRUE);
            super.markTransitionComplete(navBackStackEntry);
            this.this$0.entrySavedState.remove(navBackStackEntry);
            if (this.this$0.getBackQueue().contains(navBackStackEntry)) {
                if (getIsNavigating()) {
                    return;
                }
                this.this$0.updateBackStackLifecycle$navigation_runtime_release();
                this.this$0._visibleEntries.h(this.this$0.populateVisibleEntries$navigation_runtime_release());
                return;
            }
            this.this$0.unlinkChildFromParent$navigation_runtime_release(navBackStackEntry);
            if (navBackStackEntry.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                navBackStackEntry.setMaxLifecycle(Lifecycle.State.DESTROYED);
            }
            m<NavBackStackEntry> backQueue = this.this$0.getBackQueue();
            boolean z10 = true;
            if (!(backQueue instanceof Collection) || !backQueue.isEmpty()) {
                Iterator<NavBackStackEntry> it = backQueue.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (p.f(it.next().getId(), navBackStackEntry.getId())) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && !zF && (navControllerViewModel = this.this$0.viewModel) != null) {
                navControllerViewModel.clear(navBackStackEntry.getId());
            }
            this.this$0.updateBackStackLifecycle$navigation_runtime_release();
            this.this$0._visibleEntries.h(this.this$0.populateVisibleEntries$navigation_runtime_release());
        }

        @Override // androidx.navigation.NavigatorState
        public void pop(@NotNull final NavBackStackEntry navBackStackEntry, final boolean z10) {
            p.k(navBackStackEntry, "popUpTo");
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(navBackStackEntry.getDestination().getNavigatorName());
            if (!p.f(navigator, this.navigator)) {
                Object obj = this.this$0.navigatorState.get(navigator);
                p.h(obj);
                ((NavControllerNavigatorState) obj).pop(navBackStackEntry, z10);
            } else {
                sn.l lVar = this.this$0.popFromBackStackHandler;
                if (lVar == null) {
                    this.this$0.popBackStackFromNavigator$navigation_runtime_release(navBackStackEntry, new sn.a<r>() { // from class: androidx.navigation.NavController$NavControllerNavigatorState$pop$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // sn.a
                        public /* bridge */ /* synthetic */ r invoke() {
                            invoke2();
                            return r.f5635a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            super/*androidx.navigation.NavigatorState*/.pop(navBackStackEntry, z10);
                        }
                    });
                } else {
                    lVar.invoke(navBackStackEntry);
                    super.pop(navBackStackEntry, z10);
                }
            }
        }

        @Override // androidx.navigation.NavigatorState
        public void popWithTransition(@NotNull NavBackStackEntry navBackStackEntry, boolean z10) {
            p.k(navBackStackEntry, "popUpTo");
            super.popWithTransition(navBackStackEntry, z10);
            this.this$0.entrySavedState.put(navBackStackEntry, Boolean.valueOf(z10));
        }

        @Override // androidx.navigation.NavigatorState
        public void push(@NotNull NavBackStackEntry navBackStackEntry) {
            p.k(navBackStackEntry, "backStackEntry");
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(navBackStackEntry.getDestination().getNavigatorName());
            if (!p.f(navigator, this.navigator)) {
                Object obj = this.this$0.navigatorState.get(navigator);
                if (obj != null) {
                    ((NavControllerNavigatorState) obj).push(navBackStackEntry);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + navBackStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
            }
            sn.l lVar = this.this$0.addToBackStackHandler;
            if (lVar != null) {
                lVar.invoke(navBackStackEntry);
                addInternal(navBackStackEntry);
                return;
            }
            Log.i(NavController.TAG, "Ignoring add of destination " + navBackStackEntry.getDestination() + " outside of the call to navigate(). ");
        }
    }

    /* JADX INFO: compiled from: NavController.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\n"}, d2 = {"Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "Landroidx/navigation/NavController;", "controller", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "Lbn/r;", "onDestinationChanged", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0})
    public interface OnDestinationChangedListener {
        void onDestinationChanged(@NotNull NavController navController, @NotNull NavDestination navDestination, @Nullable Bundle bundle);
    }

    public NavController(@NotNull Context context) {
        Object next;
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
        Iterator it = ao.r.n(context, new sn.l<Context, Context>() { // from class: androidx.navigation.NavController$activity$1
            @Override // sn.l
            @Nullable
            public final Context invoke(@NotNull Context context2) {
                p.k(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.activity = (Activity) next;
        this.backQueue = new m<>();
        l<List<NavBackStackEntry>> lVarA = v.a(w.m());
        this._visibleEntries = lVarA;
        this.visibleEntries = f.c(lVarA);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleObserver = new LifecycleEventObserver() { // from class: androidx.navigation.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                NavController.m4092lifecycleObserver$lambda2(this.f5039b, lifecycleOwner, event);
            }
        };
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                this.this$0.popBackStack();
            }
        };
        this.enableOnBackPressedCallback = true;
        this._navigatorProvider = new NavigatorProvider();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        NavigatorProvider navigatorProvider = this._navigatorProvider;
        navigatorProvider.addNavigator(new NavGraphNavigator(navigatorProvider));
        this._navigatorProvider.addNavigator(new ActivityNavigator(this.context));
        this.backStackEntriesToDispatch = new ArrayList();
        this.navInflater = kotlin.b.b(new sn.a<NavInflater>() { // from class: androidx.navigation.NavController$navInflater$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final NavInflater invoke() {
                NavInflater navInflater = this.this$0.inflater;
                return navInflater == null ? new NavInflater(this.this$0.getContext(), this.this$0._navigatorProvider) : navInflater;
            }
        });
        k<NavBackStackEntry> kVarB = q.b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this._currentBackStackEntryFlow = kVarB;
        this.currentBackStackEntryFlow = f.b(kVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addEntryToBackStack(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
        m<NavBackStackEntry> mVar;
        NavDestination destination;
        List<NavBackStackEntry> list2;
        NavBackStackEntry navBackStackEntry2;
        Bundle bundle2;
        NavBackStackEntry navBackStackEntryPrevious;
        NavGraph navGraph;
        NavBackStackEntry navBackStackEntryPrevious2;
        List<NavBackStackEntry> list3;
        Bundle bundle3;
        Bundle bundle4 = bundle;
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
        List<NavBackStackEntry> list4 = list;
        NavDestination destination2 = navBackStackEntry.getDestination();
        if (!(destination2 instanceof FloatingWindow)) {
            while (!getBackQueue().isEmpty() && (getBackQueue().last().getDestination() instanceof FloatingWindow) && popBackStackInternal$default(this, getBackQueue().last().getDestination().getId(), true, false, 4, null)) {
            }
        }
        m mVar2 = new m();
        NavBackStackEntry navBackStackEntry4 = null;
        if (navDestination instanceof NavGraph) {
            NavDestination navDestination2 = destination2;
            while (true) {
                p.h(navDestination2);
                NavGraph parent = navDestination2.getParent();
                if (parent != null) {
                    ListIterator<NavBackStackEntry> listIterator = list4.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            navBackStackEntryPrevious2 = listIterator.previous();
                            if (p.f(navBackStackEntryPrevious2.getDestination(), parent)) {
                                break;
                            }
                        } else {
                            navBackStackEntryPrevious2 = null;
                            break;
                        }
                    }
                    NavBackStackEntry navBackStackEntryCreate$default = navBackStackEntryPrevious2;
                    if (navBackStackEntryCreate$default == null) {
                        destination = destination2;
                        list3 = list4;
                        bundle3 = bundle4;
                        navBackStackEntry2 = navBackStackEntry3;
                        navBackStackEntryCreate$default = NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, this.context, parent, bundle, getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
                    } else {
                        destination = destination2;
                        list3 = list4;
                        navBackStackEntry2 = navBackStackEntry3;
                        bundle3 = bundle4;
                    }
                    mVar2.addFirst(navBackStackEntryCreate$default);
                    if ((!getBackQueue().isEmpty()) && getBackQueue().last().getDestination() == parent) {
                        list2 = list3;
                        bundle2 = bundle3;
                        navGraph = parent;
                        mVar = mVar2;
                        popEntryFromBackStack$default(this, getBackQueue().last(), false, null, 6, null);
                    } else {
                        list2 = list3;
                        bundle2 = bundle3;
                        navGraph = parent;
                        mVar = mVar2;
                    }
                } else {
                    navGraph = parent;
                    mVar = mVar2;
                    destination = destination2;
                    list2 = list4;
                    navBackStackEntry2 = navBackStackEntry3;
                    bundle2 = bundle4;
                }
                if (navGraph == null || navGraph == navDestination) {
                    break;
                }
                navBackStackEntry3 = navBackStackEntry2;
                navDestination2 = navGraph;
                mVar2 = mVar;
                bundle4 = bundle2;
                list4 = list2;
                destination2 = destination;
            }
        } else {
            mVar = mVar2;
            destination = destination2;
            list2 = list4;
            navBackStackEntry2 = navBackStackEntry3;
            bundle2 = bundle4;
        }
        NavDestination destination3 = mVar.isEmpty() ? destination : ((NavBackStackEntry) mVar.first()).getDestination();
        while (destination3 != null && findDestination(destination3.getId()) == null) {
            destination3 = destination3.getParent();
            if (destination3 != null) {
                ListIterator<NavBackStackEntry> listIterator2 = list2.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        navBackStackEntryPrevious = listIterator2.previous();
                        if (p.f(navBackStackEntryPrevious.getDestination(), destination3)) {
                            break;
                        }
                    } else {
                        navBackStackEntryPrevious = null;
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntryCreate$default2 = navBackStackEntryPrevious;
                if (navBackStackEntryCreate$default2 == null) {
                    navBackStackEntryCreate$default2 = NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, this.context, destination3, destination3.addInDefaultArgs(bundle2), getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
                }
                mVar.addFirst(navBackStackEntryCreate$default2);
            }
        }
        if (!mVar.isEmpty()) {
            destination = ((NavBackStackEntry) mVar.first()).getDestination();
        }
        while (!getBackQueue().isEmpty() && (getBackQueue().last().getDestination() instanceof NavGraph) && ((NavGraph) getBackQueue().last().getDestination()).findNode(destination.getId(), false) == null) {
            popEntryFromBackStack$default(this, getBackQueue().last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntryJ = getBackQueue().j();
        if (navBackStackEntryJ == null) {
            navBackStackEntryJ = (NavBackStackEntry) mVar.j();
        }
        if (!p.f(navBackStackEntryJ != null ? navBackStackEntryJ.getDestination() : null, this._graph)) {
            ListIterator<NavBackStackEntry> listIterator3 = list2.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                NavBackStackEntry navBackStackEntryPrevious3 = listIterator3.previous();
                NavDestination destination4 = navBackStackEntryPrevious3.getDestination();
                NavGraph navGraph2 = this._graph;
                p.h(navGraph2);
                if (p.f(destination4, navGraph2)) {
                    navBackStackEntry4 = navBackStackEntryPrevious3;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntryCreate$default3 = navBackStackEntry4;
            if (navBackStackEntryCreate$default3 == null) {
                NavBackStackEntry.Companion companion = NavBackStackEntry.INSTANCE;
                Context context = this.context;
                NavGraph navGraph3 = this._graph;
                p.h(navGraph3);
                NavGraph navGraph4 = this._graph;
                p.h(navGraph4);
                navBackStackEntryCreate$default3 = NavBackStackEntry.Companion.create$default(companion, context, navGraph3, navGraph4.addInDefaultArgs(bundle2), getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
            }
            mVar.addFirst(navBackStackEntryCreate$default3);
        }
        for (NavBackStackEntry navBackStackEntry5 : mVar) {
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntry5.getDestination().getNavigatorName()));
            if (navControllerNavigatorState == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + navDestination.getNavigatorName() + " should already be created").toString());
            }
            navControllerNavigatorState.addInternal(navBackStackEntry5);
        }
        getBackQueue().addAll(mVar);
        getBackQueue().add(navBackStackEntry2);
        for (NavBackStackEntry navBackStackEntry6 : f0.P0(mVar, navBackStackEntry2)) {
            NavGraph parent2 = navBackStackEntry6.getDestination().getParent();
            if (parent2 != null) {
                linkChildToParent(navBackStackEntry6, getBackStackEntry(parent2.getId()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addEntryToBackStack$default(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i10 & 8) != 0) {
            list = w.m();
        }
        navController.addEntryToBackStack(navDestination, bundle, navBackStackEntry, list);
    }

    @MainThread
    private final boolean clearBackStackInternal(@IdRes int destinationId) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean zRestoreStateInternal = restoreStateInternal(destinationId, null, null, null);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return zRestoreStateInternal && popBackStackInternal(destinationId, true, false);
    }

    private final boolean dispatchOnDestinationChanged() {
        while (!getBackQueue().isEmpty() && (getBackQueue().last().getDestination() instanceof NavGraph)) {
            popEntryFromBackStack$default(this, getBackQueue().last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntryM = getBackQueue().m();
        if (navBackStackEntryM != null) {
            this.backStackEntriesToDispatch.add(navBackStackEntryM);
        }
        this.dispatchReentrantCount++;
        updateBackStackLifecycle$navigation_runtime_release();
        int i10 = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i10;
        if (i10 == 0) {
            List<NavBackStackEntry> listJ1 = f0.j1(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (NavBackStackEntry navBackStackEntry : listJ1) {
                Iterator<OnDestinationChangedListener> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onDestinationChanged(this, navBackStackEntry.getDestination(), navBackStackEntry.getArguments());
                }
                this._currentBackStackEntryFlow.h(navBackStackEntry);
            }
            this._visibleEntries.h(populateVisibleEntries$navigation_runtime_release());
        }
        return navBackStackEntryM != null;
    }

    @NavDeepLinkSaveStateControl
    public static final void enableDeepLinkSaveState(boolean z10) {
        INSTANCE.enableDeepLinkSaveState(z10);
    }

    private final NavDestination findDestination(NavDestination navDestination, @IdRes int i10) {
        NavGraph parent;
        if (navDestination.getId() == i10) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            parent = (NavGraph) navDestination;
        } else {
            parent = navDestination.getParent();
            p.h(parent);
        }
        return parent.findNode(i10);
    }

    private final String findInvalidDestinationDisplayNameInDeepLink(int[] deepLink) {
        NavGraph navGraph;
        NavGraph navGraph2 = this._graph;
        int length = deepLink.length;
        int i10 = 0;
        while (true) {
            NavDestination navDestinationFindNode = null;
            if (i10 >= length) {
                return null;
            }
            int i11 = deepLink[i10];
            if (i10 == 0) {
                NavGraph navGraph3 = this._graph;
                p.h(navGraph3);
                if (navGraph3.getId() == i11) {
                    navDestinationFindNode = this._graph;
                }
            } else {
                p.h(navGraph2);
                navDestinationFindNode = navGraph2.findNode(i11);
            }
            if (navDestinationFindNode == null) {
                return NavDestination.INSTANCE.getDisplayName(this.context, i11);
            }
            if (i10 != deepLink.length - 1 && (navDestinationFindNode instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestinationFindNode;
                    p.h(navGraph);
                    if (!(navGraph.findNode(navGraph.getStartDestId()) instanceof NavGraph)) {
                        break;
                    }
                    navDestinationFindNode = navGraph.findNode(navGraph.getStartDestId());
                }
                navGraph2 = navGraph;
            }
            i10++;
        }
    }

    private final int getDestinationCountOnBackStack() {
        m<NavBackStackEntry> backQueue = getBackQueue();
        int i10 = 0;
        if (!(backQueue instanceof Collection) || !backQueue.isEmpty()) {
            Iterator<NavBackStackEntry> it = backQueue.iterator();
            while (it.hasNext()) {
                if ((!(it.next().getDestination() instanceof NavGraph)) && (i10 = i10 + 1) < 0) {
                    w.v();
                }
            }
        }
        return i10;
    }

    private final List<NavBackStackEntry> instantiateBackStack(m<NavBackStackEntryState> backStackState) {
        NavDestination graph;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntryM = getBackQueue().m();
        if (navBackStackEntryM == null || (graph = navBackStackEntryM.getDestination()) == null) {
            graph = getGraph();
        }
        if (backStackState != null) {
            for (NavBackStackEntryState navBackStackEntryState : backStackState) {
                NavDestination navDestinationFindDestination = findDestination(graph, navBackStackEntryState.getDestinationId());
                if (navDestinationFindDestination == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.INSTANCE.getDisplayName(this.context, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + graph).toString());
                }
                arrayList.add(navBackStackEntryState.instantiate(this.context, navDestinationFindDestination, getHostLifecycleState$navigation_runtime_release(), this.viewModel));
                graph = navDestinationFindDestination;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lifecycleObserver$lambda-2, reason: not valid java name */
    public static final void m4092lifecycleObserver$lambda2(NavController navController, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        p.k(navController, "this$0");
        p.k(lifecycleOwner, "<anonymous parameter 0>");
        p.k(event, "event");
        Lifecycle.State targetState = event.getTargetState();
        p.j(targetState, "event.targetState");
        navController.hostLifecycleState = targetState;
        if (navController._graph != null) {
            Iterator<NavBackStackEntry> it = navController.getBackQueue().iterator();
            while (it.hasNext()) {
                it.next().handleLifecycleEvent(event);
            }
        }
    }

    private final void linkChildToParent(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.childToParentEntries.put(navBackStackEntry, navBackStackEntry2);
        if (this.parentToChildCount.get(navBackStackEntry2) == null) {
            this.parentToChildCount.put(navBackStackEntry2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(navBackStackEntry2);
        p.h(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0119 A[LOOP:1: B:44:0x0113->B:46:0x0119, LOOP_END] */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void navigate(final androidx.navigation.NavDestination r21, android.os.Bundle r22, androidx.navigation.NavOptions r23, androidx.navigation.Navigator.Extras r24) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigate(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    public static /* synthetic */ void navigate$default(NavController navController, String str, NavOptions navOptions, Navigator.Extras extras, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i10 & 2) != 0) {
            navOptions = null;
        }
        if ((i10 & 4) != 0) {
            extras = null;
        }
        navController.navigate(str, navOptions, extras);
    }

    private final void navigateInternal(Navigator<? extends NavDestination> navigator, List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras, sn.l<? super NavBackStackEntry, r> lVar) {
        this.addToBackStackHandler = lVar;
        navigator.navigate(list, navOptions, extras);
        this.addToBackStackHandler = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigateInternal$default(NavController navController, Navigator navigator, List list, NavOptions navOptions, Navigator.Extras extras, sn.l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInternal");
        }
        if ((i10 & 8) != 0) {
            lVar = new sn.l<NavBackStackEntry, r>() { // from class: androidx.navigation.NavController.navigateInternal.1
                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(NavBackStackEntry navBackStackEntry) {
                    invoke2(navBackStackEntry);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NavBackStackEntry navBackStackEntry) {
                    p.k(navBackStackEntry, "it");
                }
            };
        }
        navController.navigateInternal(navigator, list, navOptions, extras, lVar);
    }

    @MainThread
    private final void onGraphCreated(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.navigatorStateToRestore;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList(KEY_NAVIGATOR_STATE_NAMES)) != null) {
            for (String str : stringArrayList) {
                NavigatorProvider navigatorProvider = this._navigatorProvider;
                p.j(str, "name");
                Navigator navigator = navigatorProvider.getNavigator(str);
                Bundle bundle3 = bundle2.getBundle(str);
                if (bundle3 != null) {
                    navigator.onRestoreState(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.backStackToRestore;
        boolean z10 = false;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination navDestinationFindDestination = findDestination(navBackStackEntryState.getDestinationId());
                if (navDestinationFindDestination == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + NavDestination.INSTANCE.getDisplayName(this.context, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + getCurrentDestination());
                }
                NavBackStackEntry navBackStackEntryInstantiate = navBackStackEntryState.instantiate(this.context, navDestinationFindDestination, getHostLifecycleState$navigation_runtime_release(), this.viewModel);
                Navigator<? extends NavDestination> navigator2 = this._navigatorProvider.getNavigator(navDestinationFindDestination.getNavigatorName());
                Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map = this.navigatorState;
                NavControllerNavigatorState navControllerNavigatorState = map.get(navigator2);
                if (navControllerNavigatorState == null) {
                    navControllerNavigatorState = new NavControllerNavigatorState(this, navigator2);
                    map.put(navigator2, navControllerNavigatorState);
                }
                getBackQueue().add(navBackStackEntryInstantiate);
                navControllerNavigatorState.addInternal(navBackStackEntryInstantiate);
                NavGraph parent = navBackStackEntryInstantiate.getDestination().getParent();
                if (parent != null) {
                    linkChildToParent(navBackStackEntryInstantiate, getBackStackEntry(parent.getId()));
                }
            }
            updateOnBackPressedCallbackEnabled();
            this.backStackToRestore = null;
        }
        Collection<Navigator<? extends NavDestination>> collectionValues = this._navigatorProvider.getNavigators().values();
        ArrayList<Navigator<? extends NavDestination>> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((Navigator) obj).getIsAttached()) {
                arrayList.add(obj);
            }
        }
        for (Navigator<? extends NavDestination> navigator3 : arrayList) {
            Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map2 = this.navigatorState;
            NavControllerNavigatorState navControllerNavigatorState2 = map2.get(navigator3);
            if (navControllerNavigatorState2 == null) {
                navControllerNavigatorState2 = new NavControllerNavigatorState(this, navigator3);
                map2.put(navigator3, navControllerNavigatorState2);
            }
            navigator3.onAttach(navControllerNavigatorState2);
        }
        if (this._graph == null || !getBackQueue().isEmpty()) {
            dispatchOnDestinationChanged();
            return;
        }
        if (!this.deepLinkHandled && (activity = this.activity) != null) {
            p.h(activity);
            if (handleDeepLink(activity.getIntent())) {
                z10 = true;
            }
        }
        if (z10) {
            return;
        }
        NavGraph navGraph = this._graph;
        p.h(navGraph);
        navigate(navGraph, bundle, (NavOptions) null, (Navigator.Extras) null);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return navController.popBackStack(str, z10, z11);
    }

    private final void popBackStackInternal(Navigator<? extends NavDestination> navigator, NavBackStackEntry navBackStackEntry, boolean z10, sn.l<? super NavBackStackEntry, r> lVar) {
        this.popFromBackStackHandler = lVar;
        navigator.popBackStack(navBackStackEntry, z10);
        this.popFromBackStackHandler = null;
    }

    @MainThread
    private final boolean popBackStackInternal(@IdRes int destinationId, boolean inclusive, final boolean saveState) {
        NavDestination navDestination;
        if (getBackQueue().isEmpty()) {
            return false;
        }
        ArrayList<Navigator<? extends NavDestination>> arrayList = new ArrayList();
        Iterator it = f0.R0(getBackQueue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            NavDestination destination = ((NavBackStackEntry) it.next()).getDestination();
            Navigator navigator = this._navigatorProvider.getNavigator(destination.getNavigatorName());
            if (inclusive || destination.getId() != destinationId) {
                arrayList.add(navigator);
            }
            if (destination.getId() == destinationId) {
                navDestination = destination;
                break;
            }
        }
        if (navDestination == null) {
            Log.i(TAG, "Ignoring popBackStack to destination " + NavDestination.INSTANCE.getDisplayName(this.context, destinationId) + " as it was not found on the current back stack");
            return false;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final m<NavBackStackEntryState> mVar = new m<>();
        for (Navigator<? extends NavDestination> navigator2 : arrayList) {
            final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            popBackStackInternal(navigator2, getBackQueue().last(), saveState, new sn.l<NavBackStackEntry, r>() { // from class: androidx.navigation.NavController.popBackStackInternal.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(NavBackStackEntry navBackStackEntry) {
                    invoke2(navBackStackEntry);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NavBackStackEntry navBackStackEntry) {
                    p.k(navBackStackEntry, "entry");
                    ref$BooleanRef2.element = true;
                    ref$BooleanRef.element = true;
                    this.popEntryFromBackStack(navBackStackEntry, saveState, mVar);
                }
            });
            if (!ref$BooleanRef2.element) {
                break;
            }
        }
        if (saveState) {
            if (!inclusive) {
                for (NavDestination navDestination2 : SequencesKt___SequencesKt.S(ao.r.n(navDestination, new sn.l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController.popBackStackInternal.3
                    @Override // sn.l
                    @Nullable
                    public final NavDestination invoke(@NotNull NavDestination navDestination3) {
                        p.k(navDestination3, "destination");
                        NavGraph parent = navDestination3.getParent();
                        boolean z10 = false;
                        if (parent != null && parent.getStartDestId() == navDestination3.getId()) {
                            z10 = true;
                        }
                        if (z10) {
                            return navDestination3.getParent();
                        }
                        return null;
                    }
                }), new sn.l<NavDestination, Boolean>() { // from class: androidx.navigation.NavController.popBackStackInternal.4
                    {
                        super(1);
                    }

                    @Override // sn.l
                    @NotNull
                    public final Boolean invoke(@NotNull NavDestination navDestination3) {
                        p.k(navDestination3, "destination");
                        return Boolean.valueOf(!NavController.this.backStackMap.containsKey(Integer.valueOf(navDestination3.getId())));
                    }
                })) {
                    Map<Integer, String> map = this.backStackMap;
                    Integer numValueOf = Integer.valueOf(navDestination2.getId());
                    NavBackStackEntryState navBackStackEntryStateJ = mVar.j();
                    map.put(numValueOf, navBackStackEntryStateJ != null ? navBackStackEntryStateJ.getId() : null);
                }
            }
            if (!mVar.isEmpty()) {
                NavBackStackEntryState navBackStackEntryStateFirst = mVar.first();
                Iterator it2 = SequencesKt___SequencesKt.S(ao.r.n(findDestination(navBackStackEntryStateFirst.getDestinationId()), new sn.l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController.popBackStackInternal.6
                    @Override // sn.l
                    @Nullable
                    public final NavDestination invoke(@NotNull NavDestination navDestination3) {
                        p.k(navDestination3, "destination");
                        NavGraph parent = navDestination3.getParent();
                        boolean z10 = false;
                        if (parent != null && parent.getStartDestId() == navDestination3.getId()) {
                            z10 = true;
                        }
                        if (z10) {
                            return navDestination3.getParent();
                        }
                        return null;
                    }
                }), new sn.l<NavDestination, Boolean>() { // from class: androidx.navigation.NavController.popBackStackInternal.7
                    {
                        super(1);
                    }

                    @Override // sn.l
                    @NotNull
                    public final Boolean invoke(@NotNull NavDestination navDestination3) {
                        p.k(navDestination3, "destination");
                        return Boolean.valueOf(!NavController.this.backStackMap.containsKey(Integer.valueOf(navDestination3.getId())));
                    }
                }).iterator();
                while (it2.hasNext()) {
                    this.backStackMap.put(Integer.valueOf(((NavDestination) it2.next()).getId()), navBackStackEntryStateFirst.getId());
                }
                this.backStackStates.put(navBackStackEntryStateFirst.getId(), mVar);
            }
        }
        updateOnBackPressedCallbackEnabled();
        return ref$BooleanRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popBackStackInternal$default(NavController navController, Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z10, sn.l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i10 & 4) != 0) {
            lVar = new sn.l<NavBackStackEntry, r>() { // from class: androidx.navigation.NavController.popBackStackInternal.1
                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(NavBackStackEntry navBackStackEntry2) {
                    invoke2(navBackStackEntry2);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NavBackStackEntry navBackStackEntry2) {
                    p.k(navBackStackEntry2, "it");
                }
            };
        }
        navController.popBackStackInternal(navigator, navBackStackEntry, z10, lVar);
    }

    public static /* synthetic */ boolean popBackStackInternal$default(NavController navController, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return navController.popBackStackInternal(i10, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void popEntryFromBackStack(NavBackStackEntry navBackStackEntry, boolean z10, m<NavBackStackEntryState> mVar) {
        NavControllerViewModel navControllerViewModel;
        u<Set<NavBackStackEntry>> transitionsInProgress;
        Set<NavBackStackEntry> value;
        NavBackStackEntry navBackStackEntryLast = getBackQueue().last();
        if (!p.f(navBackStackEntryLast, navBackStackEntry)) {
            throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.getDestination() + ", which is not the top of the back stack (" + navBackStackEntryLast.getDestination() + ')').toString());
        }
        getBackQueue().removeLast();
        NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(get_navigatorProvider().getNavigator(navBackStackEntryLast.getDestination().getNavigatorName()));
        boolean z11 = true;
        if (!((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (value = transitionsInProgress.getValue()) == null || !value.contains(navBackStackEntryLast)) ? false : true) && !this.parentToChildCount.containsKey(navBackStackEntryLast)) {
            z11 = false;
        }
        Lifecycle.State currentState = navBackStackEntryLast.getLifecycle().getCurrentState();
        Lifecycle.State state = Lifecycle.State.CREATED;
        if (currentState.isAtLeast(state)) {
            if (z10) {
                navBackStackEntryLast.setMaxLifecycle(state);
                mVar.addFirst(new NavBackStackEntryState(navBackStackEntryLast));
            }
            if (z11) {
                navBackStackEntryLast.setMaxLifecycle(state);
            } else {
                navBackStackEntryLast.setMaxLifecycle(Lifecycle.State.DESTROYED);
                unlinkChildFromParent$navigation_runtime_release(navBackStackEntryLast);
            }
        }
        if (z10 || z11 || (navControllerViewModel = this.viewModel) == null) {
            return;
        }
        navControllerViewModel.clear(navBackStackEntryLast.getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popEntryFromBackStack$default(NavController navController, NavBackStackEntry navBackStackEntry, boolean z10, m mVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            mVar = new m();
        }
        navController.popEntryFromBackStack(navBackStackEntry, z10, mVar);
    }

    private final boolean restoreStateInternal(int id2, final Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        NavBackStackEntry navBackStackEntry;
        NavDestination destination;
        if (!this.backStackMap.containsKey(Integer.valueOf(id2))) {
            return false;
        }
        final String str = this.backStackMap.get(Integer.valueOf(id2));
        b0.K(this.backStackMap.values(), new sn.l<String, Boolean>() { // from class: androidx.navigation.NavController.restoreStateInternal.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Boolean invoke(@Nullable String str2) {
                return Boolean.valueOf(p.f(str2, str));
            }
        });
        final List<NavBackStackEntry> listInstantiateBackStack = instantiateBackStack((m) y.d(this.backStackStates).remove(str));
        ArrayList<List<NavBackStackEntry>> arrayList = new ArrayList();
        ArrayList<NavBackStackEntry> arrayList2 = new ArrayList();
        for (Object obj : listInstantiateBackStack) {
            if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                arrayList2.add(obj);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayList2) {
            List list = (List) f0.G0(arrayList);
            if (p.f((list == null || (navBackStackEntry = (NavBackStackEntry) f0.F0(list)) == null || (destination = navBackStackEntry.getDestination()) == null) ? null : destination.getNavigatorName(), navBackStackEntry2.getDestination().getNavigatorName())) {
                list.add(navBackStackEntry2);
            } else {
                arrayList.add(w.s(navBackStackEntry2));
            }
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        for (List<NavBackStackEntry> list2 : arrayList) {
            Navigator<? extends NavDestination> navigator = this._navigatorProvider.getNavigator(((NavBackStackEntry) f0.t0(list2)).getDestination().getNavigatorName());
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            navigateInternal(navigator, list2, navOptions, navigatorExtras, new sn.l<NavBackStackEntry, r>() { // from class: androidx.navigation.NavController.restoreStateInternal.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(NavBackStackEntry navBackStackEntry3) {
                    invoke2(navBackStackEntry3);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NavBackStackEntry navBackStackEntry3) {
                    List<NavBackStackEntry> listM;
                    p.k(navBackStackEntry3, "entry");
                    ref$BooleanRef.element = true;
                    int iIndexOf = listInstantiateBackStack.indexOf(navBackStackEntry3);
                    if (iIndexOf != -1) {
                        int i10 = iIndexOf + 1;
                        listM = listInstantiateBackStack.subList(ref$IntRef.element, i10);
                        ref$IntRef.element = i10;
                    } else {
                        listM = w.m();
                    }
                    this.addEntryToBackStack(navBackStackEntry3.getDestination(), args, navBackStackEntry3, listM);
                }
            });
        }
        return ref$BooleanRef.element;
    }

    private final boolean tryRelaunchUpToExplicitStack() {
        int i10 = 0;
        if (!this.deepLinkHandled) {
            return false;
        }
        Activity activity = this.activity;
        p.h(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        p.h(extras);
        int[] intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
        p.h(intArray);
        List<Integer> listH0 = cn.r.H0(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS);
        int iIntValue = ((Number) b0.R(listH0)).intValue();
        if (parcelableArrayList != null) {
        }
        if (listH0.isEmpty()) {
            return false;
        }
        NavDestination navDestinationFindDestination = findDestination(getGraph(), iIntValue);
        if (navDestinationFindDestination instanceof NavGraph) {
            iIntValue = NavGraph.INSTANCE.findStartDestination((NavGraph) navDestinationFindDestination).getId();
        }
        NavDestination currentDestination = getCurrentDestination();
        if (!(currentDestination != null && iIntValue == currentDestination.getId())) {
            return false;
        }
        NavDeepLinkBuilder navDeepLinkBuilderCreateDeepLink = createDeepLink();
        Bundle bundleBundleOf = BundleKt.bundleOf(h.a(KEY_DEEP_LINK_INTENT, intent));
        Bundle bundle = extras.getBundle(KEY_DEEP_LINK_EXTRAS);
        if (bundle != null) {
            bundleBundleOf.putAll(bundle);
        }
        navDeepLinkBuilderCreateDeepLink.setArguments(bundleBundleOf);
        for (Object obj : listH0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            navDeepLinkBuilderCreateDeepLink.addDestination(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i10) : null);
            i10 = i11;
        }
        navDeepLinkBuilderCreateDeepLink.createTaskStackBuilder().startActivities();
        Activity activity2 = this.activity;
        if (activity2 != null) {
            activity2.finish();
        }
        return true;
    }

    private final boolean tryRelaunchUpToGeneratedStack() {
        NavDestination currentDestination = getCurrentDestination();
        p.h(currentDestination);
        int id2 = currentDestination.getId();
        for (NavGraph parent = currentDestination.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestId() != id2) {
                Bundle bundle = new Bundle();
                Activity activity = this.activity;
                if (activity != null) {
                    p.h(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.activity;
                        p.h(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.activity;
                            p.h(activity3);
                            bundle.putParcelable(KEY_DEEP_LINK_INTENT, activity3.getIntent());
                            NavGraph navGraph = this._graph;
                            p.h(navGraph);
                            Activity activity4 = this.activity;
                            p.h(activity4);
                            Intent intent = activity4.getIntent();
                            p.j(intent, "activity!!.intent");
                            NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink = navGraph.matchDeepLink(new NavDeepLinkRequest(intent));
                            if (deepLinkMatchMatchDeepLink != null) {
                                bundle.putAll(deepLinkMatchMatchDeepLink.getDestination().addInDefaultArgs(deepLinkMatchMatchDeepLink.getMatchingArgs()));
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.setDestination$default(new NavDeepLinkBuilder(this), parent.getId(), (Bundle) null, 2, (Object) null).setArguments(bundle).createTaskStackBuilder().startActivities();
                Activity activity5 = this.activity;
                if (activity5 == null) {
                    return true;
                }
                activity5.finish();
                return true;
            }
            id2 = parent.getId();
        }
        return false;
    }

    private final void updateOnBackPressedCallbackEnabled() {
        this.onBackPressedCallback.setEnabled(this.enableOnBackPressedCallback && getDestinationCountOnBackStack() > 1);
    }

    public void addOnDestinationChangedListener(@NotNull OnDestinationChangedListener onDestinationChangedListener) {
        p.k(onDestinationChangedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onDestinationChangedListeners.add(onDestinationChangedListener);
        if (!getBackQueue().isEmpty()) {
            NavBackStackEntry navBackStackEntryLast = getBackQueue().last();
            onDestinationChangedListener.onDestinationChanged(this, navBackStackEntryLast.getDestination(), navBackStackEntryLast.getArguments());
        }
    }

    @MainThread
    public final boolean clearBackStack(@IdRes int destinationId) {
        return clearBackStackInternal(destinationId) && dispatchOnDestinationChanged();
    }

    @MainThread
    public final boolean clearBackStack(@NotNull String route) {
        p.k(route, "route");
        return clearBackStack(NavDestination.INSTANCE.createRoute(route).hashCode());
    }

    @NotNull
    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void enableOnBackPressed(boolean z10) {
        this.enableOnBackPressedCallback = z10;
        updateOnBackPressedCallbackEnabled();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findDestination(@IdRes int destinationId) {
        NavDestination destination;
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        p.h(navGraph);
        if (navGraph.getId() == destinationId) {
            return this._graph;
        }
        NavBackStackEntry navBackStackEntryM = getBackQueue().m();
        if (navBackStackEntryM == null || (destination = navBackStackEntryM.getDestination()) == null) {
            destination = this._graph;
            p.h(destination);
        }
        return findDestination(destination, destinationId);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findDestination(@NotNull String destinationRoute) {
        NavGraph destination;
        NavGraph parent;
        p.k(destinationRoute, "destinationRoute");
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        p.h(navGraph);
        if (p.f(navGraph.getRoute(), destinationRoute)) {
            return this._graph;
        }
        NavBackStackEntry navBackStackEntryM = getBackQueue().m();
        if (navBackStackEntryM == null || (destination = navBackStackEntryM.getDestination()) == null) {
            destination = this._graph;
            p.h(destination);
        }
        if (destination instanceof NavGraph) {
            parent = destination;
        } else {
            parent = destination.getParent();
            p.h(parent);
        }
        return parent.findNode(destinationRoute);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public m<NavBackStackEntry> getBackQueue() {
        return this.backQueue;
    }

    @NotNull
    public NavBackStackEntry getBackStackEntry(@IdRes int destinationId) {
        NavBackStackEntry navBackStackEntryPrevious;
        m<NavBackStackEntry> backQueue = getBackQueue();
        ListIterator<NavBackStackEntry> listIterator = backQueue.listIterator(backQueue.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
            if (navBackStackEntryPrevious.getDestination().getId() == destinationId) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        throw new IllegalArgumentException(("No destination with ID " + destinationId + " is on the NavController's back stack. The current destination is " + getCurrentDestination()).toString());
    }

    @NotNull
    public final NavBackStackEntry getBackStackEntry(@NotNull String route) {
        NavBackStackEntry navBackStackEntryPrevious;
        p.k(route, "route");
        m<NavBackStackEntry> backQueue = getBackQueue();
        ListIterator<NavBackStackEntry> listIterator = backQueue.listIterator(backQueue.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
            if (p.f(navBackStackEntryPrevious.getDestination().getRoute(), route)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        throw new IllegalArgumentException(("No destination with route " + route + " is on the NavController's back stack. The current destination is " + getCurrentDestination()).toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public NavBackStackEntry getCurrentBackStackEntry() {
        return getBackQueue().m();
    }

    @NotNull
    public final d<NavBackStackEntry> getCurrentBackStackEntryFlow() {
        return this.currentBackStackEntryFlow;
    }

    @Nullable
    public NavDestination getCurrentDestination() {
        NavBackStackEntry currentBackStackEntry = getCurrentBackStackEntry();
        if (currentBackStackEntry != null) {
            return currentBackStackEntry.getDestination();
        }
        return null;
    }

    @MainThread
    @NotNull
    public NavGraph getGraph() {
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        }
        if (navGraph != null) {
            return navGraph;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
    }

    @NotNull
    public final Lifecycle.State getHostLifecycleState$navigation_runtime_release() {
        return this.lifecycleOwner == null ? Lifecycle.State.CREATED : this.hostLifecycleState;
    }

    @NotNull
    public NavInflater getNavInflater() {
        return (NavInflater) this.navInflater.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getNavigatorProvider, reason: from getter */
    public NavigatorProvider get_navigatorProvider() {
        return this._navigatorProvider;
    }

    @Nullable
    public NavBackStackEntry getPreviousBackStackEntry() {
        Object next;
        Iterator it = f0.R0(getBackQueue()).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = ao.r.g(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!(((NavBackStackEntry) next).getDestination() instanceof NavGraph)) {
                break;
            }
        }
        return (NavBackStackEntry) next;
    }

    @NotNull
    public ViewModelStoreOwner getViewModelStoreOwner(@IdRes int navGraphId) {
        if (this.viewModel == null) {
            throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().".toString());
        }
        NavBackStackEntry backStackEntry = getBackStackEntry(navGraphId);
        if (backStackEntry.getDestination() instanceof NavGraph) {
            return backStackEntry;
        }
        throw new IllegalArgumentException(("No NavGraph with ID " + navGraphId + " is on the NavController's back stack").toString());
    }

    @NotNull
    public final u<List<NavBackStackEntry>> getVisibleEntries() {
        return this.visibleEntries;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleDeepLink(@org.jetbrains.annotations.Nullable android.content.Intent r20) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.handleDeepLink(android.content.Intent):boolean");
    }

    @MainThread
    public void navigate(@IdRes int i10) {
        navigate(i10, (Bundle) null);
    }

    @MainThread
    public void navigate(@IdRes int i10, @Nullable Bundle bundle) {
        navigate(i10, bundle, (NavOptions) null);
    }

    @MainThread
    public void navigate(@IdRes int i10, @Nullable Bundle bundle, @Nullable NavOptions navOptions) {
        navigate(i10, bundle, navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(@IdRes int i10, @Nullable Bundle bundle, @Nullable NavOptions navOptions, @Nullable Navigator.Extras extras) {
        int destinationId;
        NavDestination destination = getBackQueue().isEmpty() ? this._graph : getBackQueue().last().getDestination();
        if (destination == null) {
            throw new IllegalStateException("no current navigation node");
        }
        NavAction action = destination.getAction(i10);
        Bundle bundle2 = null;
        if (action != null) {
            if (navOptions == null) {
                navOptions = action.getNavOptions();
            }
            destinationId = action.getDestinationId();
            Bundle defaultArguments = action.getDefaultArguments();
            if (defaultArguments != null) {
                bundle2 = new Bundle();
                bundle2.putAll(defaultArguments);
            }
        } else {
            destinationId = i10;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (destinationId == 0 && navOptions != null && navOptions.getPopUpToId() != -1) {
            popBackStack(navOptions.getPopUpToId(), navOptions.getPopUpToInclusive());
            return;
        }
        if (!(destinationId != 0)) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        NavDestination navDestinationFindDestination = findDestination(destinationId);
        if (navDestinationFindDestination != null) {
            navigate(navDestinationFindDestination, bundle2, navOptions, extras);
            return;
        }
        NavDestination.Companion companion = NavDestination.INSTANCE;
        String displayName = companion.getDisplayName(this.context, destinationId);
        if (action == null) {
            throw new IllegalArgumentException("Navigation action/destination " + displayName + " cannot be found from the current destination " + destination);
        }
        throw new IllegalArgumentException(("Navigation destination " + displayName + " referenced from action " + companion.getDisplayName(this.context, i10) + " cannot be found from the current destination " + destination).toString());
    }

    @MainThread
    public void navigate(@NotNull Uri uri) {
        p.k(uri, "deepLink");
        navigate(new NavDeepLinkRequest(uri, null, null));
    }

    @MainThread
    public void navigate(@NotNull Uri uri, @Nullable NavOptions navOptions) {
        p.k(uri, "deepLink");
        navigate(new NavDeepLinkRequest(uri, null, null), navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(@NotNull Uri uri, @Nullable NavOptions navOptions, @Nullable Navigator.Extras extras) {
        p.k(uri, "deepLink");
        navigate(new NavDeepLinkRequest(uri, null, null), navOptions, extras);
    }

    @MainThread
    public void navigate(@NotNull NavDeepLinkRequest navDeepLinkRequest) {
        p.k(navDeepLinkRequest, AdActivity.REQUEST_KEY_EXTRA);
        navigate(navDeepLinkRequest, (NavOptions) null);
    }

    @MainThread
    public void navigate(@NotNull NavDeepLinkRequest navDeepLinkRequest, @Nullable NavOptions navOptions) {
        p.k(navDeepLinkRequest, AdActivity.REQUEST_KEY_EXTRA);
        navigate(navDeepLinkRequest, navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(@NotNull NavDeepLinkRequest navDeepLinkRequest, @Nullable NavOptions navOptions, @Nullable Navigator.Extras extras) {
        p.k(navDeepLinkRequest, AdActivity.REQUEST_KEY_EXTRA);
        NavGraph navGraph = this._graph;
        p.h(navGraph);
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink = navGraph.matchDeepLink(navDeepLinkRequest);
        if (deepLinkMatchMatchDeepLink == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + navDeepLinkRequest + " cannot be found in the navigation graph " + this._graph);
        }
        Bundle bundleAddInDefaultArgs = deepLinkMatchMatchDeepLink.getDestination().addInDefaultArgs(deepLinkMatchMatchDeepLink.getMatchingArgs());
        if (bundleAddInDefaultArgs == null) {
            bundleAddInDefaultArgs = new Bundle();
        }
        NavDestination destination = deepLinkMatchMatchDeepLink.getDestination();
        Intent intent = new Intent();
        intent.setDataAndType(navDeepLinkRequest.getUri(), navDeepLinkRequest.getMimeType());
        intent.setAction(navDeepLinkRequest.getAction());
        bundleAddInDefaultArgs.putParcelable(KEY_DEEP_LINK_INTENT, intent);
        navigate(destination, bundleAddInDefaultArgs, navOptions, extras);
    }

    @MainThread
    public void navigate(@NotNull NavDirections navDirections) {
        p.k(navDirections, "directions");
        navigate(navDirections.getActionId(), navDirections.getArguments(), (NavOptions) null);
    }

    @MainThread
    public void navigate(@NotNull NavDirections navDirections, @Nullable NavOptions navOptions) {
        p.k(navDirections, "directions");
        navigate(navDirections.getActionId(), navDirections.getArguments(), navOptions);
    }

    @MainThread
    public void navigate(@NotNull NavDirections navDirections, @NotNull Navigator.Extras extras) {
        p.k(navDirections, "directions");
        p.k(extras, "navigatorExtras");
        navigate(navDirections.getActionId(), navDirections.getArguments(), (NavOptions) null, extras);
    }

    public final void navigate(@NotNull String str) {
        p.k(str, "route");
        navigate$default(this, str, null, null, 6, null);
    }

    public final void navigate(@NotNull String str, @Nullable NavOptions navOptions) {
        p.k(str, "route");
        navigate$default(this, str, navOptions, null, 4, null);
    }

    public final void navigate(@NotNull String str, @Nullable NavOptions navOptions, @Nullable Navigator.Extras extras) {
        p.k(str, "route");
        NavDeepLinkRequest.Builder.Companion companion = NavDeepLinkRequest.Builder.INSTANCE;
        Uri uri = Uri.parse(NavDestination.INSTANCE.createRoute(str));
        p.g(uri, "Uri.parse(this)");
        navigate(companion.fromUri(uri).build(), navOptions, extras);
    }

    public final void navigate(@NotNull String str, @NotNull sn.l<? super NavOptionsBuilder, r> lVar) {
        p.k(str, "route");
        p.k(lVar, "builder");
        navigate$default(this, str, NavOptionsBuilderKt.navOptions(lVar), null, 4, null);
    }

    @MainThread
    public boolean navigateUp() {
        Intent intent;
        if (getDestinationCountOnBackStack() != 1) {
            return popBackStack();
        }
        Activity activity = this.activity;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        return (extras != null ? extras.getIntArray(KEY_DEEP_LINK_IDS) : null) != null ? tryRelaunchUpToExplicitStack() : tryRelaunchUpToGeneratedStack();
    }

    @MainThread
    public boolean popBackStack() {
        if (getBackQueue().isEmpty()) {
            return false;
        }
        NavDestination currentDestination = getCurrentDestination();
        p.h(currentDestination);
        return popBackStack(currentDestination.getId(), true);
    }

    @MainThread
    public boolean popBackStack(@IdRes int destinationId, boolean inclusive) {
        return popBackStack(destinationId, inclusive, false);
    }

    @MainThread
    public boolean popBackStack(@IdRes int destinationId, boolean inclusive, boolean saveState) {
        return popBackStackInternal(destinationId, inclusive, saveState) && dispatchOnDestinationChanged();
    }

    @MainThread
    public final boolean popBackStack(@NotNull String str, boolean z10) {
        p.k(str, "route");
        return popBackStack$default(this, str, z10, false, 4, null);
    }

    @MainThread
    public final boolean popBackStack(@NotNull String route, boolean inclusive, boolean saveState) {
        p.k(route, "route");
        return popBackStack(NavDestination.INSTANCE.createRoute(route).hashCode(), inclusive, saveState);
    }

    public final void popBackStackFromNavigator$navigation_runtime_release(@NotNull NavBackStackEntry popUpTo, @NotNull sn.a<r> onComplete) {
        p.k(popUpTo, "popUpTo");
        p.k(onComplete, "onComplete");
        int iIndexOf = getBackQueue().indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.i(TAG, "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i10 = iIndexOf + 1;
        if (i10 != getBackQueue().size()) {
            popBackStackInternal(getBackQueue().get(i10).getDestination().getId(), true, false);
        }
        popEntryFromBackStack$default(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        updateOnBackPressedCallbackEnabled();
        dispatchOnDestinationChanged();
    }

    @NotNull
    public final List<NavBackStackEntry> populateVisibleEntries$navigation_runtime_release() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Set<NavBackStackEntry> value = ((NavControllerNavigatorState) it.next()).getTransitionsInProgress().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if ((arrayList.contains(navBackStackEntry) || navBackStackEntry.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) ? false : true) {
                    arrayList2.add(obj);
                }
            }
            b0.F(arrayList, arrayList2);
        }
        m<NavBackStackEntry> backQueue = getBackQueue();
        ArrayList arrayList3 = new ArrayList();
        for (NavBackStackEntry navBackStackEntry2 : backQueue) {
            NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
            if (!arrayList.contains(navBackStackEntry3) && navBackStackEntry3.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(navBackStackEntry2);
            }
        }
        b0.F(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((NavBackStackEntry) obj2).getDestination() instanceof NavGraph)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public void removeOnDestinationChangedListener(@NotNull OnDestinationChangedListener onDestinationChangedListener) {
        p.k(onDestinationChangedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onDestinationChangedListeners.remove(onDestinationChangedListener);
    }

    @CallSuper
    public void restoreState(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.context.getClassLoader());
        this.navigatorStateToRestore = bundle.getBundle(KEY_NAVIGATOR_STATE);
        this.backStackToRestore = bundle.getParcelableArray(KEY_BACK_STACK);
        this.backStackStates.clear();
        int[] intArray = bundle.getIntArray(KEY_BACK_STACK_DEST_IDS);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_BACK_STACK_IDS);
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                this.backStackMap.put(Integer.valueOf(intArray[i10]), stringArrayList.get(i11));
                i10++;
                i11++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(KEY_BACK_STACK_STATES_IDS);
        if (stringArrayList2 != null) {
            for (String str : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(KEY_BACK_STACK_STATES_PREFIX + str);
                if (parcelableArray != null) {
                    Map<String, m<NavBackStackEntryState>> map = this.backStackStates;
                    p.j(str, "id");
                    m<NavBackStackEntryState> mVar = new m<>(parcelableArray.length);
                    Iterator itA = tn.b.a(parcelableArray);
                    while (itA.hasNext()) {
                        Parcelable parcelable = (Parcelable) itA.next();
                        if (parcelable == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        }
                        mVar.add((NavBackStackEntryState) parcelable);
                    }
                    map.put(str, mVar);
                }
            }
        }
        this.deepLinkHandled = bundle.getBoolean(KEY_DEEP_LINK_HANDLED);
    }

    @CallSuper
    @Nullable
    public Bundle saveState() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry : this._navigatorProvider.getNavigators().entrySet()) {
            String key = entry.getKey();
            Bundle bundleOnSaveState = entry.getValue().onSaveState();
            if (bundleOnSaveState != null) {
                arrayList.add(key);
                bundle2.putBundle(key, bundleOnSaveState);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList(KEY_NAVIGATOR_STATE_NAMES, arrayList);
            bundle.putBundle(KEY_NAVIGATOR_STATE, bundle2);
        } else {
            bundle = null;
        }
        if (!getBackQueue().isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[getBackQueue().size()];
            Iterator<NavBackStackEntry> it = getBackQueue().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                parcelableArr[i10] = new NavBackStackEntryState(it.next());
                i10++;
            }
            bundle.putParcelableArray(KEY_BACK_STACK, parcelableArr);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i11 = 0;
            for (Map.Entry<Integer, String> entry2 : this.backStackMap.entrySet()) {
                int iIntValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i11] = iIntValue;
                arrayList2.add(value);
                i11++;
            }
            bundle.putIntArray(KEY_BACK_STACK_DEST_IDS, iArr);
            bundle.putStringArrayList(KEY_BACK_STACK_IDS, arrayList2);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, m<NavBackStackEntryState>> entry3 : this.backStackStates.entrySet()) {
                String key2 = entry3.getKey();
                m<NavBackStackEntryState> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i12 = 0;
                for (NavBackStackEntryState navBackStackEntryState : value2) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        w.w();
                    }
                    parcelableArr2[i12] = navBackStackEntryState;
                    i12 = i13;
                }
                bundle.putParcelableArray(KEY_BACK_STACK_STATES_PREFIX + key2, parcelableArr2);
            }
            bundle.putStringArrayList(KEY_BACK_STACK_STATES_IDS, arrayList3);
        }
        if (this.deepLinkHandled) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(KEY_DEEP_LINK_HANDLED, this.deepLinkHandled);
        }
        return bundle;
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i10) {
        setGraph(getNavInflater().inflate(i10), (Bundle) null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i10, @Nullable Bundle bundle) {
        setGraph(getNavInflater().inflate(i10), bundle);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NotNull NavGraph navGraph) {
        p.k(navGraph, "graph");
        setGraph(navGraph, (Bundle) null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NotNull NavGraph navGraph, @Nullable Bundle bundle) {
        p.k(navGraph, "graph");
        if (!p.f(this._graph, navGraph)) {
            NavGraph navGraph2 = this._graph;
            if (navGraph2 != null) {
                for (Integer num : new ArrayList(this.backStackMap.keySet())) {
                    p.j(num, "id");
                    clearBackStackInternal(num.intValue());
                }
                popBackStackInternal$default(this, navGraph2.getId(), true, false, 4, null);
            }
            this._graph = navGraph;
            onGraphCreated(bundle);
            return;
        }
        int size = navGraph.getNodes().size();
        for (int i10 = 0; i10 < size; i10++) {
            NavDestination navDestinationValueAt = navGraph.getNodes().valueAt(i10);
            NavGraph navGraph3 = this._graph;
            p.h(navGraph3);
            navGraph3.getNodes().replace(i10, navDestinationValueAt);
            m<NavBackStackEntry> backQueue = getBackQueue();
            ArrayList<NavBackStackEntry> arrayList = new ArrayList();
            for (NavBackStackEntry navBackStackEntry : backQueue) {
                if (navDestinationValueAt != null && navBackStackEntry.getDestination().getId() == navDestinationValueAt.getId()) {
                    arrayList.add(navBackStackEntry);
                }
            }
            for (NavBackStackEntry navBackStackEntry2 : arrayList) {
                p.j(navDestinationValueAt, "newDestination");
                navBackStackEntry2.setDestination(navDestinationValueAt);
            }
        }
    }

    public final void setHostLifecycleState$navigation_runtime_release(@NotNull Lifecycle.State state) {
        p.k(state, "<set-?>");
        this.hostLifecycleState = state;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLifecycleOwner(@NotNull LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        p.k(lifecycleOwner, "owner");
        if (p.f(lifecycleOwner, this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner2 = this.lifecycleOwner;
        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle.removeObserver(this.lifecycleObserver);
        }
        this.lifecycleOwner = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this.lifecycleObserver);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setNavigatorProvider(@NotNull NavigatorProvider navigatorProvider) {
        p.k(navigatorProvider, "navigatorProvider");
        if (!getBackQueue().isEmpty()) {
            throw new IllegalStateException("NavigatorProvider must be set before setGraph call".toString());
        }
        this._navigatorProvider = navigatorProvider;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOnBackPressedDispatcher(@NotNull OnBackPressedDispatcher onBackPressedDispatcher) {
        p.k(onBackPressedDispatcher, "dispatcher");
        if (p.f(onBackPressedDispatcher, this.onBackPressedDispatcher)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
        }
        this.onBackPressedCallback.remove();
        this.onBackPressedDispatcher = onBackPressedDispatcher;
        onBackPressedDispatcher.addCallback(lifecycleOwner, this.onBackPressedCallback);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        lifecycle.removeObserver(this.lifecycleObserver);
        lifecycle.addObserver(this.lifecycleObserver);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewModelStore(@NotNull ViewModelStore viewModelStore) {
        p.k(viewModelStore, "viewModelStore");
        NavControllerViewModel navControllerViewModel = this.viewModel;
        NavControllerViewModel.Companion companion = NavControllerViewModel.INSTANCE;
        if (p.f(navControllerViewModel, companion.getInstance(viewModelStore))) {
            return;
        }
        if (!getBackQueue().isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
        }
        this.viewModel = companion.getInstance(viewModelStore);
    }

    @Nullable
    public final NavBackStackEntry unlinkChildFromParent$navigation_runtime_release(@NotNull NavBackStackEntry child) {
        p.k(child, "child");
        NavBackStackEntry navBackStackEntryRemove = this.childToParentEntries.remove(child);
        if (navBackStackEntryRemove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(navBackStackEntryRemove);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntryRemove.getDestination().getNavigatorName()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.markTransitionComplete(navBackStackEntryRemove);
            }
            this.parentToChildCount.remove(navBackStackEntryRemove);
        }
        return navBackStackEntryRemove;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateBackStackLifecycle$navigation_runtime_release() {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.updateBackStackLifecycle$navigation_runtime_release():void");
    }
}
