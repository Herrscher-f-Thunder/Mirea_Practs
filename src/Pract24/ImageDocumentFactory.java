package Pract24;

public class ImageDocumentFactory implements ICreateDocument{
    @Override
    public IDocument createDocument() {
        return new ImageDocument();
    }

    @Override
    public IDocument openDocument() {
        return new ImageDocument();
    }
}
