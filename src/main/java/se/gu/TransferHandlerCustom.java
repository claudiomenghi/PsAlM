package se.gu;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.TransferHandler;

public class TransferHandlerCustom extends TransferHandler {
	
	DefaultListModel model = new DefaultListModel();
	 public boolean importData(TransferSupport support) {
	      if (!canImport(support)) {
	        return false;
	      }

	      Transferable transferable = support.getTransferable();
	      String line;
	      try {
	        line = (String) transferable.getTransferData(DataFlavor.stringFlavor);
	      } catch (Exception e) {
	        return false;
	      }
	      JList.DropLocation dl = (JList.DropLocation) support.getDropLocation();
	      int index = dl.getIndex();
	      model.add(index++, line);
	      return true;
	    }

}
