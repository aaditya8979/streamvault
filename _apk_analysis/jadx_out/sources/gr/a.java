package gr;

import ir.g;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.ValidationException;

/* JADX INFO: compiled from: DeviceDescriptorBinder.java */
/* JADX INFO: loaded from: classes11.dex */
public interface a {
    String a(qr.a aVar, rr.c cVar, g gVar) throws DescriptorBindingException;

    <T extends qr.a> T b(T t10, String str) throws ValidationException, DescriptorBindingException;
}
