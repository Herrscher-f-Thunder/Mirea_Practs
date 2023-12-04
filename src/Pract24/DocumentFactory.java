package Pract24;

public class DocumentFactory {
    public IDocument createDocument(ICreateDocument iCreateDocument) {
        return iCreateDocument.createDocument();
    }

    public IDocument openDocument(ICreateDocument iCreateDocument) {
        return iCreateDocument.openDocument();
    }
}
