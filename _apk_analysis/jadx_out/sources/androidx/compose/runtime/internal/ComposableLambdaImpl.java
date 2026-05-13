package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import bn.r;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.squareup.picasso.Utils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.b;
import sn.c;
import sn.e;
import sn.f;
import sn.g;
import sn.h;
import sn.i;
import sn.j;
import sn.k;
import sn.m;
import sn.n;
import sn.q;
import sn.s;
import sn.t;
import sn.u;
import sn.v;
import sn.w;
import tn.p;
import tn.y;

/* JADX INFO: compiled from: ComposableLambda.jvm.kt */
/* JADX INFO: loaded from: classes11.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u001b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002J%\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002J/\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002J9\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002JC\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002JM\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002JW\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002Ja\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002Jk\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002Ju\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002J\u0087\u0001\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0096\u0002J\u0091\u0001\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0096\u0002J\u009b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0096\u0002J¥\u0001\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0096\u0002J¯\u0001\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0096\u0002J¹\u0001\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0096\u0002JÃ\u0001\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0096\u0002JÍ\u0001\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0096\u0002J×\u0001\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0096\u0002R\u0017\u0010!\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaImpl;", "Landroidx/compose/runtime/internal/ComposableLambda;", "Lbn/r;", "trackWrite", "Landroidx/compose/runtime/Composer;", "composer", "trackRead", "", "block", "update", "c", "", Utils.VERB_CHANGED, "invoke", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "changed1", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "key", "I", "getKey", "()I", "", "tracked", "Z", "_block", "Ljava/lang/Object;", "Landroidx/compose/runtime/RecomposeScope;", "scope", "Landroidx/compose/runtime/RecomposeScope;", "", "scopes", "Ljava/util/List;", "<init>", "(IZ)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class ComposableLambdaImpl implements ComposableLambda {

    @Nullable
    private Object _block;
    private final int key;

    @Nullable
    private RecomposeScope scope;

    @Nullable
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaImpl(int i10, boolean z10) {
        this.key = i10;
        this.tracked = z10;
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (!this.tracked || (recomposeScope = composer.getRecomposeScope()) == null) {
            return;
        }
        composer.recordUsed(recomposeScope);
        if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
            this.scope = recomposeScope;
            return;
        }
        List<RecomposeScope> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(recomposeScope);
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (ComposableLambdaKt.replacableWith(list.get(i10), recomposeScope)) {
                list.set(i10, recomposeScope);
                return;
            }
        }
        list.add(recomposeScope);
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invalidate();
                }
                list.clear();
            }
        }
    }

    public final int getKey() {
        return this.key;
    }

    @Nullable
    public Object invoke(@NotNull Composer c10, int changed) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = changed | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(0) : ComposableLambdaKt.sameBits(0));
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        Object objMo2invoke = ((sn.p) y.e(obj, 2)).mo2invoke(composerStartRestartGroup, Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope((sn.p) y.e(this, 2));
        }
        return objMo2invoke;
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @NotNull Composer c10, final int changed) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(1) : ComposableLambdaKt.sameBits(1)) | changed;
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((q) y.e(obj, 3)).invoke(p12, composerStartRestartGroup, Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, composer, changed | 1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo2invoke(Composer composer, Integer num) {
        return invoke(composer, num.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @NotNull Composer c10, final int changed) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(2) : ComposableLambdaKt.sameBits(2)) | changed;
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((sn.r) y.e(obj, 4)).invoke(p12, p22, composerStartRestartGroup, Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, composer, changed | 1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Composer composer, Integer num) {
        return invoke(obj, composer, num.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @NotNull Composer c10, final int changed) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(3) : ComposableLambdaKt.sameBits(3)) | changed;
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((s) y.e(obj, 5)).invoke(p12, p22, p32, composerStartRestartGroup, Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, p32, composer, changed | 1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Composer composer, Integer num) {
        return invoke(obj, obj2, composer, num.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @Nullable final Object p42, @NotNull Composer c10, final int changed) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(4) : ComposableLambdaKt.sameBits(4)) | changed;
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((t) y.e(obj, 6)).invoke(p12, p22, p32, p42, composerStartRestartGroup, Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, p32, p42, composer, changed | 1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.s
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, composer, num.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @Nullable final Object p42, @Nullable final Object p52, @NotNull Composer c10, final int changed) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = changed | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(5) : ComposableLambdaKt.sameBits(5));
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((u) y.e(obj, 7)).invoke(p12, p22, p32, p42, p52, composerStartRestartGroup, Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, p32, p42, p52, composer, changed | 1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.t
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, composer, num.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @Nullable final Object p42, @Nullable final Object p52, @Nullable final Object p62, @NotNull Composer c10, final int changed) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = changed | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(6) : ComposableLambdaKt.sameBits(6));
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((v) y.e(obj, 8)).invoke(p12, p22, p32, p42, p52, p62, composerStartRestartGroup, Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, p32, p42, p52, p62, composer, changed | 1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.u
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, composer, num.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @Nullable final Object p42, @Nullable final Object p52, @Nullable final Object p62, @Nullable final Object p72, @NotNull Composer c10, final int changed) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = changed | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(7) : ComposableLambdaKt.sameBits(7));
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((w) y.e(obj, 9)).invoke(p12, p22, p32, p42, p52, p62, p72, composerStartRestartGroup, Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, p32, p42, p52, p62, p72, composer, changed | 1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.v
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, composer, num.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @Nullable final Object p42, @Nullable final Object p52, @Nullable final Object p62, @Nullable final Object p72, @Nullable final Object p82, @NotNull Composer c10, final int changed) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = changed | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(8) : ComposableLambdaKt.sameBits(8));
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((b) y.e(obj, 10)).invoke(p12, p22, p32, p42, p52, p62, p72, p82, composerStartRestartGroup, Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, p32, p42, p52, p62, p72, p82, composer, changed | 1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.w
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, composer, num.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @Nullable final Object p42, @Nullable final Object p52, @Nullable final Object p62, @Nullable final Object p72, @Nullable final Object p82, @Nullable final Object p92, @NotNull Composer c10, final int changed) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = changed | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(9) : ComposableLambdaKt.sameBits(9));
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function11<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((c) y.e(obj, 11)).invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, composerStartRestartGroup, Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, composer, changed | 1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.b
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, composer, num.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @Nullable final Object p42, @Nullable final Object p52, @Nullable final Object p62, @Nullable final Object p72, @Nullable final Object p82, @Nullable final Object p92, @Nullable final Object p10, @NotNull Composer c10, final int changed, int changed1) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = changed1 | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(10) : ComposableLambdaKt.sameBits(10));
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function13<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((e) y.e(obj, 13)).invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, composerStartRestartGroup, Integer.valueOf(changed), Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl composableLambdaImpl = ComposableLambdaImpl.this;
                    Object obj2 = p12;
                    Object obj3 = p22;
                    Object obj4 = p32;
                    Object obj5 = p42;
                    Object obj6 = p52;
                    Object obj7 = p62;
                    Object obj8 = p72;
                    Object obj9 = p82;
                    Object obj10 = p92;
                    Object obj11 = p10;
                    int i11 = changed;
                    composableLambdaImpl.invoke(obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, composer, i11 | 1, i11);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Composer composer, Integer num) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, composer, num.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @Nullable final Object p42, @Nullable final Object p52, @Nullable final Object p62, @Nullable final Object p72, @Nullable final Object p82, @Nullable final Object p92, @Nullable final Object p10, @Nullable final Object p11, @NotNull Composer c10, final int changed, final int changed1) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = changed1 | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(11) : ComposableLambdaKt.sameBits(11));
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function14<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((f) y.e(obj, 14)).invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, composerStartRestartGroup, Integer.valueOf(changed), Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.11
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, composer, changed | 1, changed1);
                }
            });
        }
        return objInvoke;
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @Nullable final Object p42, @Nullable final Object p52, @Nullable final Object p62, @Nullable final Object p72, @Nullable final Object p82, @Nullable final Object p92, @Nullable final Object p10, @Nullable final Object p11, @Nullable final Object p122, @NotNull Composer c10, final int changed, final int changed1) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = changed1 | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(12) : ComposableLambdaKt.sameBits(12));
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function15<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((g) y.e(obj, 15)).invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, p122, composerStartRestartGroup, Integer.valueOf(changed), Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, p122, composer, changed | 1, changed1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.e
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, composer, num.intValue(), num2.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @Nullable final Object p42, @Nullable final Object p52, @Nullable final Object p62, @Nullable final Object p72, @Nullable final Object p82, @Nullable final Object p92, @Nullable final Object p10, @Nullable final Object p11, @Nullable final Object p122, @Nullable final Object p13, @NotNull Composer c10, final int changed, final int changed1) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = changed1 | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(13) : ComposableLambdaKt.sameBits(13));
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function16<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((h) y.e(obj, 16)).invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, p122, p13, composerStartRestartGroup, Integer.valueOf(changed), Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.13
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, p122, p13, composer, changed | 1, changed1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.f
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, composer, num.intValue(), num2.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @Nullable final Object p42, @Nullable final Object p52, @Nullable final Object p62, @Nullable final Object p72, @Nullable final Object p82, @Nullable final Object p92, @Nullable final Object p10, @Nullable final Object p11, @Nullable final Object p122, @Nullable final Object p13, @Nullable final Object p14, @NotNull Composer c10, final int changed, final int changed1) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = changed1 | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(14) : ComposableLambdaKt.sameBits(14));
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function17<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((i) y.e(obj, 17)).invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, p122, p13, p14, composerStartRestartGroup, Integer.valueOf(changed), Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.14
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, p122, p13, p14, composer, changed | 1, changed1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.g
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, composer, num.intValue(), num2.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @Nullable final Object p42, @Nullable final Object p52, @Nullable final Object p62, @Nullable final Object p72, @Nullable final Object p82, @Nullable final Object p92, @Nullable final Object p10, @Nullable final Object p11, @Nullable final Object p122, @Nullable final Object p13, @Nullable final Object p14, @Nullable final Object p15, @NotNull Composer c10, final int changed, final int changed1) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = changed1 | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(15) : ComposableLambdaKt.sameBits(15));
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function18<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((j) y.e(obj, 18)).invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, p122, p13, p14, p15, composerStartRestartGroup, Integer.valueOf(changed), Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.15
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, p122, p13, p14, p15, composer, changed | 1, changed1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.h
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, composer, num.intValue(), num2.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @Nullable final Object p42, @Nullable final Object p52, @Nullable final Object p62, @Nullable final Object p72, @Nullable final Object p82, @Nullable final Object p92, @Nullable final Object p10, @Nullable final Object p11, @Nullable final Object p122, @Nullable final Object p13, @Nullable final Object p14, @Nullable final Object p15, @Nullable final Object p16, @NotNull Composer c10, final int changed, final int changed1) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = changed1 | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(16) : ComposableLambdaKt.sameBits(16));
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function19<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'p16')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((k) y.e(obj, 19)).invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, p122, p13, p14, p15, p16, composerStartRestartGroup, Integer.valueOf(changed), Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.16
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, p122, p13, p14, p15, p16, composer, changed | 1, changed1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.i
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, composer, num.intValue(), num2.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @Nullable final Object p42, @Nullable final Object p52, @Nullable final Object p62, @Nullable final Object p72, @Nullable final Object p82, @Nullable final Object p92, @Nullable final Object p10, @Nullable final Object p11, @Nullable final Object p122, @Nullable final Object p13, @Nullable final Object p14, @Nullable final Object p15, @Nullable final Object p16, @Nullable final Object p17, @NotNull Composer c10, final int changed, final int changed1) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = changed1 | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(17) : ComposableLambdaKt.sameBits(17));
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function20<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'p16')] kotlin.Any?, @[ParameterName(name = 'p17')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((m) y.e(obj, 20)).invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, p122, p13, p14, p15, p16, p17, composerStartRestartGroup, Integer.valueOf(changed), Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.17
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, p122, p13, p14, p15, p16, p17, composer, changed | 1, changed1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.j
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, composer, num.intValue(), num2.intValue());
    }

    @Nullable
    public Object invoke(@Nullable final Object p12, @Nullable final Object p22, @Nullable final Object p32, @Nullable final Object p42, @Nullable final Object p52, @Nullable final Object p62, @Nullable final Object p72, @Nullable final Object p82, @Nullable final Object p92, @Nullable final Object p10, @Nullable final Object p11, @Nullable final Object p122, @Nullable final Object p13, @Nullable final Object p14, @Nullable final Object p15, @Nullable final Object p16, @Nullable final Object p17, @Nullable final Object p18, @NotNull Composer c10, final int changed, final int changed1) {
        p.k(c10, "c");
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = changed1 | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(18) : ComposableLambdaKt.sameBits(18));
        Object obj = this._block;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function21<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'p16')] kotlin.Any?, @[ParameterName(name = 'p17')] kotlin.Any?, @[ParameterName(name = 'p18')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((n) y.e(obj, 21)).invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, p122, p13, p14, p15, p16, p17, p18, composerStartRestartGroup, Integer.valueOf(changed), Integer.valueOf(iDifferentBits));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.18
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                public final void invoke(@NotNull Composer composer, int i10) {
                    p.k(composer, ResourceManager.KEY_MD5CHECK);
                    ComposableLambdaImpl.this.invoke(p12, p22, p32, p42, p52, p62, p72, p82, p92, p10, p11, p122, p13, p14, p15, p16, p17, p18, composer, changed | 1, changed1);
                }
            });
        }
        return objInvoke;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, composer, num.intValue(), num2.intValue());
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.m
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, composer, num.intValue(), num2.intValue());
    }

    @Override // androidx.compose.runtime.internal.ComposableLambda, sn.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Composer composer, Integer num, Integer num2) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, composer, num.intValue(), num2.intValue());
    }

    public final void update(@NotNull Object obj) {
        p.k(obj, "block");
        if (p.f(this._block, obj)) {
            return;
        }
        boolean z10 = this._block == null;
        this._block = obj;
        if (z10) {
            return;
        }
        trackWrite();
    }
}
