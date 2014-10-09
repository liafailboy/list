package list;

import list.CommandBuilder.RepeatFrequency;

/**
 * An example implementation of ICommand.
 * Other commands (Edit, Delete, etc.) should follow
 * this sample.
 * 
 * @author andhieka, michael
 */
public class AddCommand implements ICommand {
	private String mTitle;
	private Date mStartTime;
	private Date mEndTime;
	private RepeatFrequency mRepeatFrequency;
	private String mPlace;
	private String mCategory;
	private String mNotes;
	
	/**
	 * Save the provided information in private variable so that it can
	 * be used during execute() command
	 * 
	 * @param title
	 * @param startTime
	 * @param endTime
	 * @param repeatFrequency
	 * @param place
	 * @param category
	 * @param notes
	 */
	AddCommand(String title,
               Date startTime,
               Date endTime,
               RepeatFrequency repeatFrequency,
               String place,
               String category,
               String notes) {
		
		mTitle = title;
		mStartTime = startTime;
		mEndTime = endTime;
		mRepeatFrequency = repeatFrequency;
		mPlace = place;
		mCategory = category;
		mNotes = notes;
	}
	
	@Override
	public String execute() {
		Task task = new Task();
		task.setTitle(mTitle);
		
		TaskManager.addTask(task);
		return "Task added succesfully";
	}

}
