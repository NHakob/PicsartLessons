import java.io.File;
import java.text.DecimalFormat;

public class SizeCounter {
    public static long getFileSize(File folder) {
        long foldersize = 0;
        File[] filelist = folder.listFiles();

        if (filelist != null) {
            for (int i = 0; i < filelist.length; i++) {
                if (filelist[i].isDirectory()) {
                    foldersize += getFileSize(filelist[i]);
                } else {
                    foldersize += filelist[i].length();
                    GUI.size += filelist[i].length();
                }

            }

        }

        return foldersize;
    }

    public static String getReadableSizeByte(long size) {
        final String[] units = new String[]{"B", "KB", "MB", "GB", "TB"};
        int digitGroups = (int) (Math.log10(size) / Math.log10(1024));
        return size <= 0 ? "0" : new DecimalFormat("#,##0.#").format(size / Math.pow(1024, digitGroups))
                + " " + units[digitGroups];
    }
}
