package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView= findViewById(R.id.recyclerView)

        val listOfFruits= getListOfFruits()
        val fruitAdaptor = FruitAdapter(listOfFruits)
        recyclerView.adapter= fruitAdaptor
        recyclerView.setHasFixedSize(true)
        fruitAdaptor.onItemClick={
            val intent= Intent(this,FruitDetails::class.java)
            intent.putExtra("FRUITS", it)
            startActivity(intent)

            }

    }
    private fun getListOfFruits(): List<Fruits>{
        val fruits= mutableListOf<Fruits>()
        fruits.add(Fruits("Mango", R.drawable.mango,"BENEFITS:\n"+
                "Packed with nutrients.\n" +
                "Low in calories.\n" +
                "May help prevent diabetes.\n" +
                "High in healthy plant compounds.\n" +
                "Contains immune-boosting nutrients.\n" +
                "Supports heart health.\n" +
                "May improve digestive health.\n" +
                "May support eye health."))
        fruits.add(Fruits("Apples", R.drawable.apple,"BENEFITS:\n"+
                "Apples may lower high cholesterol and blood pressure.\n" +
                "Eating foods with fiber, including apples, can aid digestion.\n" +
                "Apples can support a healthy immune system.\n" +
                "Apples are a diabetes-friendly fruit.\n" +
                "The antioxidants in apples may play a role in cancer prevention."))
        fruits.add(Fruits("Pineapples", R.drawable.pineapple,"BENEFITS:\n"+
                "Loaded with nutrients.\n" +
                "Contains disease-fighting antioxidants.\n" +
                "May aid digestion.\n" +
                "May reduce your risk of cancer.\n" +
                "May boost immunity and suppress inflammation.\n" +
                "May ease symptoms of arthritis.\n" +
                "May speed recovery after surgery or strenuous exercise.\n" +
                "Easy to add to your diet."))
        fruits.add(Fruits("Plum", R.drawable.plum,"BENEFITS:\n"+
                "Heart disease. Phytochemicals and nutrients in plums lower the inflammation that triggers heart disease.\n" +
                "Anxiety. A plum a day may keep anxiety away.\n" +
                "Constipation Relief.\n" +
                "High blood pressure and stroke.\n" +
                "Rich in antioxidants.\n" +
                "Reduce blood sugar.\n" +
                "Bone health."))
        fruits.add(Fruits("Dates", R.drawable.dates,"BENEFITS:\n"+ "A strong source of protein.\n" +
                "Fibre, which helps lower the risk of heart disease and prevents constipation.\n" +
                "Vitamins such as B1, B2, B3, B5, A, C, K and D.\n" +
                "Selenium, manganese, copper and magnesium, which are good for bone health.\n" +
                "Potassium, which helps support the nervous system.\n"))
        fruits.add(Fruits("Grapes", R.drawable.grapes,"BENEFITS:\n"+"Helps your immune system.\n" +
                "Prevents cancer.\n" +
                "Lowers blood pressure.\n" +
                "Protects against heart disease.\n" +
                "Reduces high cholesterol.\n" +
                "Protects against diabetes.\n" +
                "Helps maintain brain health.\n" +
                "Improves bone health"))
        fruits.add(Fruits("Tomatoes", R.drawable.tomatoes,"BENEFITS:\n"+"Tomatoes are good for your skin.\n" +
                "Tomatoes help prevent several types of cancer.\n" +
                "Tomatoes help maintain strong bones.\n" +
                "Tomatoes help repair damage caused by smoking.\n" +
                "Tomatoes provide essential antioxidants.\n" +
                "Tomatoes are good for your heart.\n" +
                "Tomatoes are good for your hair."))
        fruits.add(Fruits("Blueberries", R.drawable.blueberries,"BENEFITS:\n"+"Blueberries are the best source of antioxidants.\n" +
                "Blueberries are nutritious and low in calories.\n" +
                "Blueberries prevent early aging and Cancer.\n" +
                "Blueberries regulate blood pressure.\n" +
                "Blueberries manage cholesterol levels.\n" +
                "Blueberries secure heart health."))
        fruits.add(Fruits("Bananas", R.drawable.bananas,"BENEFITS:\n"+"Rich in nutrients.\n" +
                "May improve blood sugar levels.\n" +
                "May support digestive health.\n" +
                "May aid weight loss.\n" +
                "May support heart health.\n" +
                "Full of antioxidants.\n" +
                "May help you feel fuller.\n" +
                "May improve insulin sensitivity when unripe."))
        fruits.add(Fruits("Cranberries", R.drawable.cranberries,"BENEFITS:\n"+"Prevent urinary tract infections. Probably the most known benefit of cranberry juice is that it can prevent urinary tract infections (UTIs).\n" +
                "Prevent cavities.\n" +
                "Reduce inflammation.\n" +
                "Maintain digestive health.\n" +
                "Improve heart health.\n" +
                "Prevent cancer."))
        fruits.add(Fruits("Strawberries", R.drawable.strawberries,"BENEFITS:\n"+"Improve blood antioxidant status.\n" +
                "Decrease oxidative stress.\n" +
                "Reduce inflammation.\n" +
                "Improve vascular function.\n" +
                "Improve your blood lipid profile.\n" +
                "Reduce the harmful oxidation of LDL (bad) cholesterol."))
        fruits.add(Fruits("Cherries", R.drawable.cherries,"BENEFITS:\n"+"Reduce the risk of cancer.\n" +
                "Support healthy sleep.\n" +
                "Relieve arthritis pain.\n" +
                "Reduce belly fat.\n" +
                "Reduce post-exercise muscle pain.\n" +
                "Lower the risk of stroke.\n" +
                "Improve skin.\n" +
                "Lower the risks of diabetes."))
        return fruits
    }
}