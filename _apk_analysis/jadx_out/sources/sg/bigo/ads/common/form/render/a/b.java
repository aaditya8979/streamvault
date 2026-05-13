package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.form.render.a.a;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends a {
    public b(@NonNull e.c cVar, @Nullable Map<String, Object> map, Context context, a.InterfaceC1015a interfaceC1015a) {
        super(cVar, map, context, interfaceC1015a);
    }

    @Override // sg.bigo.ads.common.form.render.a.a
    public final View b() {
        View viewA = sg.bigo.ads.common.utils.a.a(this.f82055h, sg.bigo.ads.common.form.render.a.a(2), null, false);
        this.f82056i = viewA;
        if (viewA == null) {
            return null;
        }
        a.a((TextView) viewA.findViewById(R.id.inter_form_edit_title), this.f82051d);
        a(1);
        final EditText editText = (EditText) this.f82056i.findViewById(R.id.inter_form_edit_content);
        String strA = sg.bigo.ads.common.form.a.a(this.f82052e, this.f82049b);
        if (editText != null) {
            editText.setTextColor(sg.bigo.ads.common.form.render.a.b());
            editText.setHint(sg.bigo.ads.common.form.a.a(this.f82055h, R.string.bigo_ad_form_question_hint));
            if (!q.a((CharSequence) strA)) {
                a.InterfaceC1015a interfaceC1015a = this.f82057j;
                if (interfaceC1015a != null) {
                    interfaceC1015a.a(this.f82048a.f81801d, strA);
                }
                this.f82050c = strA;
                editText.setText(strA);
            }
            editText.addTextChangedListener(new TextWatcher() { // from class: sg.bigo.ads.common.form.render.a.b.1
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    b.this.f82050c = editText.getText().toString();
                    b bVar = b.this;
                    a.InterfaceC1015a interfaceC1015a2 = bVar.f82057j;
                    if (interfaceC1015a2 != null) {
                        interfaceC1015a2.a(bVar.f82048a.f81801d, bVar.f82050c);
                    }
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                }
            });
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sg.bigo.ads.common.form.render.a.b.2
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    b bVar = b.this;
                    if (z10) {
                        bVar.a(2);
                    } else {
                        bVar.a();
                    }
                }
            });
        }
        return this.f82056i;
    }
}
