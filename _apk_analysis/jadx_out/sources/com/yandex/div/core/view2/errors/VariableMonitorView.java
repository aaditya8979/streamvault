package com.yandex.div.core.view2.errors;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bn.r;
import cn.f0;
import cn.w;
import cn.x;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.errors.VariableMonitorView;
import com.yandex.div.data.Variable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: VariableMonitorView.kt */
/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"ViewConstructor"})
public final class VariableMonitorView extends LinearLayout {

    @NotNull
    private final Context context;

    @NotNull
    private final LinearLayout title;

    @NotNull
    private final VariableAdapter variablesAdapter;

    /* JADX INFO: renamed from: com.yandex.div.core.view2.errors.VariableMonitorView$1, reason: invalid class name */
    /* JADX INFO: compiled from: VariableMonitorView.kt */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements l<List<? extends Pair<? extends String, ? extends Variable>>, r> {
        public AnonymousClass1(Object obj) {
            super(1, obj, VariableMonitorView.class, "updateTable", "updateTable(Ljava/util/List;)V", 0);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ r invoke(List<? extends Pair<? extends String, ? extends Variable>> list) {
            invoke2((List<? extends Pair<String, ? extends Variable>>) list);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<? extends Pair<String, ? extends Variable>> list) {
            ((VariableMonitorView) this.receiver).updateTable(list);
        }
    }

    public VariableMonitorView(@NotNull Context context, @NotNull VariableMonitor variableMonitor) {
        super(context);
        this.context = context;
        this.variablesAdapter = new VariableAdapter(new VariableMonitorView$variablesAdapter$1(variableMonitor));
        LinearLayout linearLayoutCreateTableTitle = createTableTitle();
        this.title = linearLayoutCreateTableTitle;
        setOrientation(1);
        variableMonitor.setVariablesUpdatedCallback(new AnonymousClass1(this));
        addView(linearLayoutCreateTableTitle, new LinearLayout.LayoutParams(-1, -2));
        addView(createTable(), new LinearLayout.LayoutParams(-1, -2));
    }

    private final TextView createCellTitle(String str) {
        TextView textView = new TextView(this.context);
        int iDpToPx = BaseDivViewExtensionsKt.dpToPx(8, textView.getResources().getDisplayMetrics());
        textView.setPadding(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
        textView.setTextColor(-1);
        textView.setText(str);
        textView.setTypeface(textView.getTypeface(), 1);
        return textView;
    }

    private final RecyclerView createTable() {
        RecyclerView recyclerView = new RecyclerView(this.context);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.variablesAdapter);
        recyclerView.setBackgroundColor(Color.argb(50, 0, 0, 0));
        return recyclerView;
    }

    private final LinearLayout createTableTitle() {
        LinearLayout linearLayout = new LinearLayout(this.context);
        List listP = w.p(200, 60, 100);
        List listP2 = w.p("name", "type", "value");
        ArrayList arrayList = new ArrayList(x.x(listP2, 10));
        Iterator it = listP2.iterator();
        while (it.hasNext()) {
            arrayList.add(createCellTitle((String) it.next()));
        }
        for (Pair pair : f0.p1(arrayList, listP)) {
            linearLayout.addView((TextView) pair.component1(), new LinearLayout.LayoutParams(BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(((Number) pair.component2()).intValue()), linearLayout.getResources().getDisplayMetrics()), -2));
        }
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTable(List<? extends Pair<String, ? extends Variable>> list) {
        VariableAdapter variableAdapter = this.variablesAdapter;
        ArrayList arrayList = new ArrayList(x.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(VariableMonitorViewKt.toModel((Variable) pair.component2(), (String) pair.component1()));
        }
        variableAdapter.submitList(arrayList, new Runnable() { // from class: mg.d
            @Override // java.lang.Runnable
            public final void run() {
                VariableMonitorView.updateTable$lambda$5(this.f74248b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTable$lambda$5(VariableMonitorView variableMonitorView) {
        variableMonitorView.title.setVisibility(variableMonitorView.variablesAdapter.getItemCount() != 0 ? 0 : 8);
    }
}
