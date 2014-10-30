package list.view;

import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import list.ITask;
import list.IUserInterface;

public class MainController implements IUserInterface{

	@FXML
	private TextField console;
	
	@FXML
	private BorderPane mainPane;
	
	@FXML
	private BorderPane taskDetailPane;
	
	@FXML
	private Label labelTask1;
	@FXML
	private Label labelTask2;
	@FXML
	private Label labelTask3;
	@FXML
	private Label labelTask4;
	@FXML
	private Label labelTask5;
	@FXML
	private Label labelTask6;
	@FXML
	private Label labelTask7;
	@FXML
	private Label labelTask8;
	@FXML
	private Label labelTask9;
	@FXML
	private Label labelTask10;
	
	@FXML
	private ImageView imageViewDate1;
	@FXML
	private ImageView imageViewDate2;
	@FXML
	private ImageView imageViewDate3;
	@FXML
	private ImageView imageViewDate4;
	@FXML
	private ImageView imageViewDate5;
	@FXML
	private ImageView imageViewDate6;
	@FXML
	private ImageView imageViewDate7;
	@FXML
	private ImageView imageViewDate8;
	@FXML
	private ImageView imageViewDate9;
	@FXML
	private ImageView imageViewDate10;
	
	private Label[] taskLabels = { 
		labelTask1, labelTask2, labelTask3, labelTask4, labelTask5, 
		labelTask6, labelTask7, labelTask8, labelTask9, labelTask10 
	};
	
	private ImageView[] dateImageViews = {
		imageViewDate1, imageViewDate2, imageViewDate3, imageViewDate4,
		imageViewDate5, imageViewDate6, imageViewDate7, imageViewDate8,
		imageViewDate9, imageViewDate10
	};
		
	/**
	 * Constructor
	 */
	public MainController() {
	}

	public void prepareData(List<ITask> tasks) {
		assert (tasks.size() == 10);
		for (int i = 0; i < tasks.size(); i++) {
			String taskTitle = tasks.get(i).getTitle();
			taskLabels[i].setText(taskTitle);
		
		}
		
		//TODO: Update ImageView
	}
	
	
	/**
	 * Initializes this controller class
	 */
	@FXML
	private void initialize() {
				
		console.setOnAction((event) -> {
			handleEnterAction();
		});
	}
	
	/**
	 * This method is called when user presses 'enter' on keyboard
	 * after writing a command in the console.
	 */
	@FXML
	private void handleEnterAction() {
		String userInput = console.getText();
		//Controller.processUserInput(userInput);
		
		labelTask1.requestFocus(); //set focus to something else
		console.setText("");
		console.promptTextProperty();
	}

	@Override
	public void displayTaskDetail(ITask task) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(String pageTitle, List<ITask> tasks) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearDisplay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepareForUserInput() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayMessageToUser(String message) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
