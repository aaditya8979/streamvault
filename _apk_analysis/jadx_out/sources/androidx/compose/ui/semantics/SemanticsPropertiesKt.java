package androidx.compose.ui.semantics;

import androidx.autofill.HintConstants;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import bn.e;
import bn.r;
import cn.v;
import com.ironsource.Y1;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import sn.p;
import sn.q;
import tn.t;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000º\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u001a\u0015\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a-\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0082\b\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\n\u001a\n\u0010\r\u001a\u00020\u000b*\u00020\n\u001a\f\u0010\u000e\u001a\u00020\u000b*\u00020\nH\u0007\u001a\n\u0010\u000f\u001a\u00020\u000b*\u00020\n\u001a\n\u0010\u0010\u001a\u00020\u000b*\u00020\n\u001a\n\u0010\u0011\u001a\u00020\u000b*\u00020\n\u001a\u0012\u0010\u0013\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0005\u001a\u001e\u0010\u0018\u001a\u00020\u000b*\u00020\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u001a\n\u0010\u0019\u001a\u00020\u000b*\u00020\n\u001a2\u0010\u001e\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u001a\u0010\u001d\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014\u001a&\u0010 \u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001a&\u0010!\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001a2\u0010$\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"\u001a*\u0010%\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u0014\u001a,\u0010&\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014\u001a,\u0010(\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014\u001a8\u0010*\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052 \u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010)\u001a&\u0010+\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001a&\u0010,\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001a&\u0010-\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001a&\u0010.\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001a&\u0010/\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001a&\u00100\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u001a&\u00101\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\"/\u00109\u001a\u00020\u0005*\u00020\n2\u0006\u00102\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108\"/\u0010@\u001a\u00020:*\u00020\n2\u0006\u00102\u001a\u00020:8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u00104\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?\"/\u0010D\u001a\u00020\u0005*\u00020\n2\u0006\u00102\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u00104\u001a\u0004\bB\u00106\"\u0004\bC\u00108\"2\u0010K\u001a\u00020E*\u00020\n2\u0006\u00102\u001a\u00020E8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bF\u00104\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J\"/\u0010Q\u001a\u00020\u0004*\u00020\n2\u0006\u00102\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bL\u00104\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P\"/\u0010X\u001a\u00020R*\u00020\n2\u0006\u00102\u001a\u00020R8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bS\u00104\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W\"/\u0010\\\u001a\u00020R*\u00020\n2\u0006\u00102\u001a\u00020R8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bY\u00104\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010W\"2\u0010a\u001a\u00020]*\u00020\n2\u0006\u00102\u001a\u00020]8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\b^\u00104\u001a\u0004\b_\u0010H\"\u0004\b`\u0010J\"/\u0010e\u001a\u00020\u0005*\u00020\n2\u0006\u00102\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bb\u00104\u001a\u0004\bc\u00106\"\u0004\bd\u00108\"/\u0010k\u001a\u00020'*\u00020\n2\u0006\u00102\u001a\u00020'8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bf\u00104\u001a\u0004\bg\u0010h\"\u0004\bi\u0010j\"2\u0010r\u001a\u00020l*\u00020\n2\u0006\u00102\u001a\u00020l8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bm\u00104\u001a\u0004\bn\u0010o\"\u0004\bp\u0010q\"2\u0010w\u001a\u00020s*\u00020\n2\u0006\u00102\u001a\u00020s8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bt\u00104\u001a\u0004\bu\u0010H\"\u0004\bv\u0010J\"/\u0010{\u001a\u00020\u0004*\u00020\n2\u0006\u00102\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bx\u00104\u001a\u0004\by\u0010N\"\u0004\bz\u0010P\"2\u0010\u0082\u0001\u001a\u00020|*\u00020\n2\u0006\u00102\u001a\u00020|8F@FX\u0086\u008e\u0002¢\u0006\u0014\n\u0004\b}\u00104\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001\"7\u0010\u0089\u0001\u001a\u00030\u0083\u0001*\u00020\n2\u0007\u00102\u001a\u00030\u0083\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0084\u0001\u00104\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001\"7\u0010\u0090\u0001\u001a\u00030\u008a\u0001*\u00020\n2\u0007\u00102\u001a\u00030\u008a\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u008b\u0001\u00104\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001\"E\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u0001*\u00020\n2\u000e\u00102\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0093\u0001\u00104\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001\",\u0010\u009c\u0001\u001a\u00020\u0005*\u00020\n2\u0007\u0010\u0099\u0001\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009a\u0001\u00106\"\u0005\b\u009b\u0001\u00108\"+\u0010\u009e\u0001\u001a\u00020'*\u00020\n2\u0007\u0010\u0099\u0001\u001a\u00020'8F@FX\u0086\u000e¢\u0006\r\u001a\u0005\b\u009d\u0001\u0010h\"\u0004\b(\u0010j\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u009f\u0001"}, d2 = {"T", "throwSemanticsGetNotSupported", "()Ljava/lang/Object;", "Lbn/e;", "", "", "name", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/AccessibilityAction;", "ActionPropertyKey", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lbn/r;", "heading", Y1.f30689e, "invisibleToUser", "popup", "dialog", HintConstants.AUTOFILL_HINT_PASSWORD, UnifiedMediationParams.KEY_DESCRIPTION, "error", "Lkotlin/Function1;", "", "", "mapping", "indexForKey", "selectableGroup", "label", "", "Landroidx/compose/ui/text/TextLayoutResult;", "action", "getTextLayoutResult", "Lkotlin/Function0;", "onClick", "onLongClick", "Lkotlin/Function2;", "", "scrollBy", "scrollToIndex", "setProgress", "Landroidx/compose/ui/text/AnnotatedString;", "setText", "Lkotlin/Function3;", "setSelection", "copyText", "cutText", "pasteText", "expand", "collapse", "dismiss", "requestFocus", "<set-?>", "stateDescription$delegate", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getStateDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "setStateDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "stateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "progressBarRangeInfo$delegate", "getProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "setProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ProgressBarRangeInfo;)V", "progressBarRangeInfo", "paneTitle$delegate", "getPaneTitle", "setPaneTitle", "paneTitle", "Landroidx/compose/ui/semantics/LiveRegionMode;", "liveRegion$delegate", "getLiveRegion", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", "setLiveRegion-hR3wRGc", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;I)V", "liveRegion", "focused$delegate", "getFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "focused", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "horizontalScrollAxisRange$delegate", "getHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "horizontalScrollAxisRange", "verticalScrollAxisRange$delegate", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "verticalScrollAxisRange", "Landroidx/compose/ui/semantics/Role;", "role$delegate", "getRole", "setRole-kuIjeqM", "role", "testTag$delegate", "getTestTag", "setTestTag", "testTag", "editableText$delegate", "getEditableText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", "setEditableText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V", "editableText", "Landroidx/compose/ui/text/TextRange;", "textSelectionRange$delegate", "getTextSelectionRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", "setTextSelectionRange-FDrldGo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;J)V", "textSelectionRange", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction$delegate", "getImeAction", "setImeAction-4L7nppU", "imeAction", "selected$delegate", "getSelected", "setSelected", "selected", "Landroidx/compose/ui/semantics/CollectionInfo;", "collectionInfo$delegate", "getCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", "setCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionInfo;)V", "collectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "collectionItemInfo$delegate", "getCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", "setCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionItemInfo;)V", "collectionItemInfo", "Landroidx/compose/ui/state/ToggleableState;", "toggleableState$delegate", "getToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", "setToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/state/ToggleableState;)V", "toggleableState", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "customActions$delegate", "getCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", "setCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/util/List;)V", "customActions", "value", "getContentDescription", "setContentDescription", "contentDescription", "getText", "text", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class SemanticsPropertiesKt {
    public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), t.f(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    @NotNull
    private static final SemanticsPropertyKey collectionInfo$delegate;

    @NotNull
    private static final SemanticsPropertyKey collectionItemInfo$delegate;

    @NotNull
    private static final SemanticsPropertyKey customActions$delegate;

    @NotNull
    private static final SemanticsPropertyKey editableText$delegate;

    @NotNull
    private static final SemanticsPropertyKey focused$delegate;

    @NotNull
    private static final SemanticsPropertyKey horizontalScrollAxisRange$delegate;

    @NotNull
    private static final SemanticsPropertyKey imeAction$delegate;

    @NotNull
    private static final SemanticsPropertyKey liveRegion$delegate;

    @NotNull
    private static final SemanticsPropertyKey paneTitle$delegate;

    @NotNull
    private static final SemanticsPropertyKey progressBarRangeInfo$delegate;

    @NotNull
    private static final SemanticsPropertyKey role$delegate;

    @NotNull
    private static final SemanticsPropertyKey selected$delegate;

    @NotNull
    private static final SemanticsPropertyKey stateDescription$delegate;

    @NotNull
    private static final SemanticsPropertyKey testTag$delegate;

    @NotNull
    private static final SemanticsPropertyKey textSelectionRange$delegate;

    @NotNull
    private static final SemanticsPropertyKey toggleableState$delegate;

    @NotNull
    private static final SemanticsPropertyKey verticalScrollAxisRange$delegate;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1, reason: invalid class name */
    /* JADX INFO: compiled from: SemanticsProperties.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbn/e;", "", "T", "Landroidx/compose/ui/semantics/AccessibilityAction;", "parentValue", "childValue", "invoke", "(Landroidx/compose/ui/semantics/AccessibilityAction;Landroidx/compose/ui/semantics/AccessibilityAction;)Landroidx/compose/ui/semantics/AccessibilityAction;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1<T> extends Lambda implements p<AccessibilityAction<T>, AccessibilityAction<T>, AccessibilityAction<T>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final AccessibilityAction<T> mo2invoke(@Nullable AccessibilityAction<T> accessibilityAction, @NotNull AccessibilityAction<T> accessibilityAction2) {
            String label;
            e action;
            tn.p.k(accessibilityAction2, "childValue");
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new AccessibilityAction<>(label, action);
        }
    }

    static {
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        stateDescription$delegate = semanticsProperties.getStateDescription();
        progressBarRangeInfo$delegate = semanticsProperties.getProgressBarRangeInfo();
        paneTitle$delegate = semanticsProperties.getPaneTitle();
        liveRegion$delegate = semanticsProperties.getLiveRegion();
        focused$delegate = semanticsProperties.getFocused();
        horizontalScrollAxisRange$delegate = semanticsProperties.getHorizontalScrollAxisRange();
        verticalScrollAxisRange$delegate = semanticsProperties.getVerticalScrollAxisRange();
        role$delegate = semanticsProperties.getRole();
        testTag$delegate = semanticsProperties.getTestTag();
        editableText$delegate = semanticsProperties.getEditableText();
        textSelectionRange$delegate = semanticsProperties.getTextSelectionRange();
        imeAction$delegate = semanticsProperties.getImeAction();
        selected$delegate = semanticsProperties.getSelected();
        collectionInfo$delegate = semanticsProperties.getCollectionInfo();
        collectionItemInfo$delegate = semanticsProperties.getCollectionItemInfo();
        toggleableState$delegate = semanticsProperties.getToggleableState();
        customActions$delegate = SemanticsActions.INSTANCE.getCustomActions();
    }

    private static final <T extends e<? extends Boolean>> SemanticsPropertyKey<AccessibilityAction<T>> ActionPropertyKey(String str) {
        return new SemanticsPropertyKey<>(str, AnonymousClass1.INSTANCE);
    }

    public static final void collapse(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable a<Boolean> aVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCollapse(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void collapse$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        collapse(semanticsPropertyReceiver, str, aVar);
    }

    public static final void copyText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable a<Boolean> aVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCopyText(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void copyText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        copyText(semanticsPropertyReceiver, str, aVar);
    }

    public static final void cutText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable a<Boolean> aVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCutText(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void cutText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        cutText(semanticsPropertyReceiver, str, aVar);
    }

    public static final void dialog(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsDialog(), r.f5635a);
    }

    public static final void disabled(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getDisabled(), r.f5635a);
    }

    public static final void dismiss(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable a<Boolean> aVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getDismiss(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void dismiss$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        dismiss(semanticsPropertyReceiver, str, aVar);
    }

    public static final void error(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getError(), str);
    }

    public static final void expand(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable a<Boolean> aVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getExpand(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void expand$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        expand(semanticsPropertyReceiver, str, aVar);
    }

    @NotNull
    public static final CollectionInfo getCollectionInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return (CollectionInfo) collectionInfo$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[13]);
    }

    @NotNull
    public static final CollectionItemInfo getCollectionItemInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return (CollectionItemInfo) collectionItemInfo$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[14]);
    }

    @NotNull
    public static final String getContentDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return (String) throwSemanticsGetNotSupported();
    }

    @NotNull
    public static final List<CustomAccessibilityAction> getCustomActions(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return (List) customActions$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[16]);
    }

    @NotNull
    public static final AnnotatedString getEditableText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return (AnnotatedString) editableText$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[9]);
    }

    public static final boolean getFocused(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return ((Boolean) focused$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[4])).booleanValue();
    }

    @NotNull
    public static final ScrollAxisRange getHorizontalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return (ScrollAxisRange) horizontalScrollAxisRange$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[5]);
    }

    public static final int getImeAction(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return ((ImeAction) imeAction$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[11])).getValue();
    }

    public static final int getLiveRegion(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return ((LiveRegionMode) liveRegion$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[3])).getValue();
    }

    @NotNull
    public static final String getPaneTitle(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return (String) paneTitle$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[2]);
    }

    @NotNull
    public static final ProgressBarRangeInfo getProgressBarRangeInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return (ProgressBarRangeInfo) progressBarRangeInfo$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[1]);
    }

    public static final int getRole(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return ((Role) role$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[7])).getValue();
    }

    public static final boolean getSelected(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return ((Boolean) selected$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[12])).booleanValue();
    }

    @NotNull
    public static final String getStateDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return (String) stateDescription$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    @NotNull
    public static final String getTestTag(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return (String) testTag$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[8]);
    }

    @NotNull
    public static final AnnotatedString getText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return (AnnotatedString) throwSemanticsGetNotSupported();
    }

    public static final void getTextLayoutResult(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable l<? super List<TextLayoutResult>, Boolean> lVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getGetTextLayoutResult(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void getTextLayoutResult$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        getTextLayoutResult(semanticsPropertyReceiver, str, lVar);
    }

    public static final long getTextSelectionRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return ((TextRange) textSelectionRange$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[10])).getPackedValue();
    }

    @NotNull
    public static final ToggleableState getToggleableState(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return (ToggleableState) toggleableState$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[15]);
    }

    @NotNull
    public static final ScrollAxisRange getVerticalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        return (ScrollAxisRange) verticalScrollAxisRange$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[6]);
    }

    public static final void heading(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getHeading(), r.f5635a);
    }

    public static final void indexForKey(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull l<Object, Integer> lVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(lVar, "mapping");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIndexForKey(), lVar);
    }

    @ExperimentalComposeUiApi
    public static final void invisibleToUser(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getInvisibleToUser(), r.f5635a);
    }

    public static final void onClick(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable a<Boolean> aVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnClick(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void onClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        onClick(semanticsPropertyReceiver, str, aVar);
    }

    public static final void onLongClick(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable a<Boolean> aVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnLongClick(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void onLongClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        onLongClick(semanticsPropertyReceiver, str, aVar);
    }

    public static final void password(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getPassword(), r.f5635a);
    }

    public static final void pasteText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable a<Boolean> aVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPasteText(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void pasteText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        pasteText(semanticsPropertyReceiver, str, aVar);
    }

    public static final void popup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsPopup(), r.f5635a);
    }

    public static final void requestFocus(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable a<Boolean> aVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getRequestFocus(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void requestFocus$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        requestFocus(semanticsPropertyReceiver, str, aVar);
    }

    public static final void scrollBy(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable p<? super Float, ? super Float, Boolean> pVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollBy(), new AccessibilityAction(str, pVar));
    }

    public static /* synthetic */ void scrollBy$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        scrollBy(semanticsPropertyReceiver, str, pVar);
    }

    public static final void scrollToIndex(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @NotNull l<? super Integer, Boolean> lVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(lVar, "action");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollToIndex(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void scrollToIndex$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        scrollToIndex(semanticsPropertyReceiver, str, lVar);
    }

    public static final void selectableGroup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getSelectableGroup(), r.f5635a);
    }

    public static final void setCollectionInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull CollectionInfo collectionInfo) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(collectionInfo, "<set-?>");
        collectionInfo$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[13], collectionInfo);
    }

    public static final void setCollectionItemInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull CollectionItemInfo collectionItemInfo) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(collectionItemInfo, "<set-?>");
        collectionItemInfo$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[14], collectionItemInfo);
    }

    public static final void setContentDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(str, "value");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getContentDescription(), v.e(str));
    }

    public static final void setCustomActions(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull List<CustomAccessibilityAction> list) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(list, "<set-?>");
        customActions$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[16], list);
    }

    public static final void setEditableText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull AnnotatedString annotatedString) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(annotatedString, "<set-?>");
        editableText$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[9], annotatedString);
    }

    public static final void setFocused(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z10) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        focused$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[4], Boolean.valueOf(z10));
    }

    public static final void setHorizontalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ScrollAxisRange scrollAxisRange) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(scrollAxisRange, "<set-?>");
        horizontalScrollAxisRange$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[5], scrollAxisRange);
    }

    /* JADX INFO: renamed from: setImeAction-4L7nppU, reason: not valid java name */
    public static final void m3383setImeAction4L7nppU(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, int i10) {
        tn.p.k(semanticsPropertyReceiver, "$this$imeAction");
        imeAction$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[11], ImeAction.m3597boximpl(i10));
    }

    /* JADX INFO: renamed from: setLiveRegion-hR3wRGc, reason: not valid java name */
    public static final void m3384setLiveRegionhR3wRGc(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, int i10) {
        tn.p.k(semanticsPropertyReceiver, "$this$liveRegion");
        liveRegion$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[3], LiveRegionMode.m3356boximpl(i10));
    }

    public static final void setPaneTitle(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(str, "<set-?>");
        paneTitle$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[2], str);
    }

    public static final void setProgress(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable l<? super Float, Boolean> lVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetProgress(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void setProgress$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        setProgress(semanticsPropertyReceiver, str, lVar);
    }

    public static final void setProgressBarRangeInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ProgressBarRangeInfo progressBarRangeInfo) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(progressBarRangeInfo, "<set-?>");
        progressBarRangeInfo$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[1], progressBarRangeInfo);
    }

    /* JADX INFO: renamed from: setRole-kuIjeqM, reason: not valid java name */
    public static final void m3385setRolekuIjeqM(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, int i10) {
        tn.p.k(semanticsPropertyReceiver, "$this$role");
        role$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[7], Role.m3365boximpl(i10));
    }

    public static final void setSelected(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z10) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        selected$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[12], Boolean.valueOf(z10));
    }

    public static final void setSelection(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable q<? super Integer, ? super Integer, ? super Boolean, Boolean> qVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetSelection(), new AccessibilityAction(str, qVar));
    }

    public static /* synthetic */ void setSelection$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        setSelection(semanticsPropertyReceiver, str, qVar);
    }

    public static final void setStateDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(str, "<set-?>");
        stateDescription$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], str);
    }

    public static final void setTestTag(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(str, "<set-?>");
        testTag$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[8], str);
    }

    public static final void setText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull AnnotatedString annotatedString) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(annotatedString, "value");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getText(), v.e(annotatedString));
    }

    public static final void setText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable l<? super AnnotatedString, Boolean> lVar) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetText(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void setText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        setText(semanticsPropertyReceiver, str, lVar);
    }

    /* JADX INFO: renamed from: setTextSelectionRange-FDrldGo, reason: not valid java name */
    public static final void m3386setTextSelectionRangeFDrldGo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, long j10) {
        tn.p.k(semanticsPropertyReceiver, "$this$textSelectionRange");
        textSelectionRange$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[10], TextRange.m3462boximpl(j10));
    }

    public static final void setToggleableState(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ToggleableState toggleableState) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(toggleableState, "<set-?>");
        toggleableState$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[15], toggleableState);
    }

    public static final void setVerticalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ScrollAxisRange scrollAxisRange) {
        tn.p.k(semanticsPropertyReceiver, "<this>");
        tn.p.k(scrollAxisRange, "<set-?>");
        verticalScrollAxisRange$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[6], scrollAxisRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T throwSemanticsGetNotSupported() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }
}
