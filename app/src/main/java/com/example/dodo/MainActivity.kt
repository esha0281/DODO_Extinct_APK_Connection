package com.example.dodo


//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.Modifier
//import androidx.camera.core.CameraSelector
//import androidx.camera.core.ImageAnalysis
//import androidx.camera.core.ImageCapture
//import androidx.camera.core.ImageProxy
//import androidx.camera.core.Preview
//import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
//import androidx.core.content.ContextCompat
//import com.google.cloud.generativelanguage.v1beta2.GenerateTextRequest
//import com.google.cloud.generativelanguage.v1beta2.GenerateTextResponse
//import com.google.cloud.generativelanguage.v1beta2.GenerativeServiceClient
//import com.google.cloud.generativelanguage.v1beta2.InputConfig
//import com.google.cloud.generativelanguage.v1beta2.OutputConfig
//import com.google.cloud.generativelanguage.v1beta2.Prompt
//import com.google.protobuf.ByteString
import java.io.ByteArrayOutputStream
//import java.util.concurrent.ExecutorService
//import java.util.concurrent.Executors
import java.io.FileInputStream
import java.io.IOException
import android.content.Context
import androidx.camera.core.UseCase
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
//import android.graphics.drawable.BitmapDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dodo.ui.theme.DoDoTheme
import androidx.lifecycle.ViewModel
//import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
//import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.Font
//import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
//import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material3.BottomAppBar
//import androidx.compose.material3.BottomAppBarDefaults
//import androidx.compose.material3.FloatingActionButtonDefaults
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.style.TextOverflow
//import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
//import androidx.databinding.DataBindingUtil
//import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.dodo.databinding.ActivityMain7Binding
//import androidx.activity.result.contract.ActivityResultContracts
//import androidx.camera.core.Preview
import android.Manifest
import android.content.ContentValues
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Bitmap.createBitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Environment
//import android.os.Bundle
import android.provider.MediaStore
//import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.ImageCapture
import androidx.camera.video.Recorder
import androidx.camera.video.Recording
import androidx.camera.video.VideoCapture
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
//import com.example.dodo.DataBinderMapperImpl
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.camera.lifecycle.ProcessCameraProvider
//import androidx.camera.core.Preview
import androidx.camera.core.CameraSelector
import android.util.Log
import androidx.activity.viewModels
import androidx.annotation.DrawableRes
import androidx.camera.core.CameraProvider
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageCaptureException
import androidx.camera.core.ImageProxy
import androidx.camera.video.FallbackStrategy
import androidx.camera.video.MediaStoreOutputOptions
import androidx.camera.video.Quality
import androidx.camera.video.QualitySelector
import androidx.camera.video.VideoRecordEvent
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.core.content.ContextCompat.getDrawable
import androidx.core.content.PermissionChecker
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.drawable.toBitmap
import androidx.core.graphics.drawable.toDrawable
import androidx.lifecycle.viewModelScope
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.content
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.File
//import com.sun.istack.Builder
import java.nio.ByteBuffer
import java.text.SimpleDateFormat
import java.util.Locale
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DoDoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Column (verticalArrangement = Arrangement.Center) {

                        Greeting(
                            name = "DODO Prototype_1",
                            modifier = Modifier.padding(innerPadding)
                        )

//                        val viewModel: MyViewModel by viewModels()
//
//                        println("don'tneed")
//                        viewModel.fetchData()
//                        println("Help")
                        iconMainPage()
                        mainPageText()
                        registrationfieldInput()
                        registrationButton {
                            System.out.println("Help")
                            if(personalUsernameLogIN == "Bob") {
                                System.out.println("Hello")
                                if(personalEmailLogIN == "bob123@gmail.com") {
                                    System.out.println("Great")
                                    if(personalPasswordIN == "bob") {
                                        System.out.println("Good")
                                        val intent = Intent(this@MainActivity, MainActivity2::class.java)
                                        startActivity(intent)
                                    }
                                }
                            }
                        }


                    }





                }
            }
        }
    }
}


class MyViewModel : ViewModel() {
    fun fetchData() {
        viewModelScope.launch(Dispatchers.IO) {

            val bitmap = BitmapFactory.decodeFile(generalURI)

            val inputContent = content {
                image(bitmap)
                text("What is the animal in the picture and the specific species name/recognition? (if possible)?")
            }

            val response = generativeModel.generateContent(inputContent)
            descriptionResult = response.text.toString()
            println(response.text)
        }
    }
}

class MainActivity2 : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DoDoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column (verticalArrangement = Arrangement.Center) {
                        Greeting(
                            name = "DODO Prototype_2",
                            modifier = Modifier.padding(innerPadding)
                        )
                        System.out.println(personalUsernameLogIN)

                        Row(Modifier.padding(start = 15.dp, top = 20.dp)) {
                            Text(
                                text = "Hello, $personalUsernameLogIN!",
                                fontFamily = glacialIndifference,
                                fontSize = 25.sp,
                            )
                        }

                        Row(Modifier.padding(start = 15.dp, top = 2.dp)) {
                            Text (
                                text = "Set Up Your Journey\nWhat type of adventurer are you?"

                            )
                        }

                        Row(Modifier.padding(start = 25.dp, top = 20.dp)) {
                            profileButtonPublic {
                                System.out.println("Public")
                                publicFigure = true
                            }

                            profileButtonResearch {
                                System.out.println("Research")
                                researchFigure = true
                            }
                        }

                        Row(Modifier.padding(start = 15.dp, top = 20.dp)) {
                            Text (
                                text = "Choose a species you're interested in?",
                                fontFamily = glacialIndifference,
                                fontSize = 15.sp,

                            )
                        }


                        Row(Modifier.padding(start = 80.dp, top = 20.dp)) {
                            reptileLoverButton {
                                reptileLover = true
                            }
                            Text(
                                text = "      ",
                                fontFamily = glacialIndifference,
                                fontSize = 25.sp,
                            )
                            amphibiansLoverButton {
                                amphibiansLover = true
                            }
                        }
                        Row(Modifier.padding(start = 80.dp, top = 20.dp)) {
                            mammalsLoverButton {
                                mammalsLover = true
                            }
                            Text(
                                text = "      ",
                                fontFamily = glacialIndifference,
                                fontSize = 25.sp,
                            )

                            birdLoverButton {
                                birdLover = true
                            }
                        }

                        Row(Modifier.padding(start = 140.dp, top = 20.dp)) {
                            plantsLoverButton {
                                plantsLover = true
                            }
                            nextButton {
                                System.out.println("Next")
                                val intent = Intent(this@MainActivity2, MainActivity3::class.java)
                                startActivity(intent)
                            }
                        }


                    }
                }
            }
        }

    }
}

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DoDoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column (verticalArrangement = Arrangement.Center) {

                        if(generalURI != "") {
                            val viewModel: MyViewModel by viewModels()

                            println("don't need")
                            viewModel.fetchData()
                            println("Help")
                        }
                        Greeting(
                            name = "DODO Prototype_3",
                            modifier = Modifier.padding(innerPadding)
                        )

                        Row(Modifier.padding(start = 10.dp, top = 1.dp)) {
                            profileHomeButton {

                            }

                            Row(Modifier.padding(start = 30.dp, top = 15.dp)) {
                                Text(
                                    text = "Welcome, $personalUsernameLogIN!",
                                    fontFamily = glacialIndifference,
                                    fontSize = 30.sp
                                )
                            }

                        }

                        Text(
                            text = descriptionResult
                        )

                        System.out.println(descriptionResult)

                        Row() {
                            ElevatedCardExample()
                        }

                        BottomAppBarExample(this@MainActivity3, this@MainActivity3)

                    }
                }
            }
        }

    }
}

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DoDoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column (verticalArrangement = Arrangement.Center) {

                        Greeting(
                            name = "DODO Prototype_4",
                            modifier = Modifier.padding(innerPadding)
                        )

                    }
                }
            }
        }

    }
}

class MainActivity5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DoDoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column (verticalArrangement = Arrangement.Center) {
                        Greeting(
                            name = "DODO Prototype_5",
                            modifier = Modifier.padding(innerPadding)
                        )

                    }
                }
            }
        }

    }
}

class MainActivity6 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DoDoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column (verticalArrangement = Arrangement.Center) {
                        Greeting(
                            name = "DODO Prototype_6",
                            modifier = Modifier.padding(innerPadding)
                        )

                    }
                }
            }
        }

    }
}

class MainActivity7 : ComponentActivity() {
//    private lateinit var cameraProvider: CameraProvider
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main_7)
//
//        // Create a CameraProvider instance
//        val cameraProviderFuture = ProcessCameraProvider.getInstance(this)
//        cameraProviderFuture.addListener({
//            cameraProvider = cameraProviderFuture.get()
//        }, ContextCompat.getMainExecutor(this))
//    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            DoDoTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Column (verticalArrangement = Arrangement.Center) {
//                        Greeting(
//                            name = "DODO Prototype_7",
//                            modifier = Modifier.padding(innerPadding)
//                        )
//
//                    }
//                }
//            }
//        }
//
//    }

//    class GeminiAPI {
//
//        private val projectId = "YOUR_PROJECT_ID"
//        private val location = "us-central1"
//        private val modelId = "gemini-pro-vision"
//
//        private val client = GenerativeServiceClient.create()
//
//        fun analyzePhotoForAnimals(photoPath: String): List<String> {
//            // Read the image file into a ByteString
//            val imageBytes: ByteString
//            try {
//                val imageStream = FileInputStream(photoPath)
//                imageBytes = ByteString.readFrom(imageStream)
//            } catch (e: IOException) {
//                throw RuntimeException("Error reading image file: $photoPath", e)
//            }
//
//            // Create the prompt
//            val prompt = TextPrompt.newBuilder()
//                .setText("What animals are in this photo?")
//                .build()
//
//            // Create the request
//            val request = GenerateContentRequest.newBuilder()
//                .setParent(ModelName.of(projectId, location, modelId).toString())
//                .setPrompt(prompt)
//                .addParts(
//                    Part.newBuilder()
//                        .setImageData(
//                            Part.ImageData.newBuilder()
//                                .setContent(imageBytes)
//                                .build()
//                        )
//                        .build()
//                )
//                .build()
//
//            // Call the API
//            val response: GenerateContentResponse = client.generateContent(request)
//
//            // Extract the animal names from the response
//            val animals = mutableListOf<String>()
//            response.candidatesList.forEach { candidate ->
//                animals.add(candidate.content)
//            }
//
//            return animals
//        }
//    }


    private lateinit var viewBinding: ActivityMain7Binding

    private var imageCapture: ImageCapture? = null

    private var videoCapture: VideoCapture<Recorder>? = null
    private var recording: Recording? = null

    private lateinit var cameraExecutor: ExecutorService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMain7Binding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        // Request camera permissions
        if (allPermissionsGranted()) {
            startCamera()
        } else {
            requestPermissions()
        }

        // Set up the listeners for take photo and video capture buttons
        viewBinding.imageCaptureButton.setOnClickListener { takePhoto() }
        viewBinding.videoCaptureButton.setOnClickListener { captureVideo() }

        cameraExecutor = Executors.newSingleThreadExecutor()
    }

    private fun takePhoto() {
        val imageCapture = imageCapture ?: return
        // Create time stamped name and MediaStore entry.
        val name = SimpleDateFormat(FILENAME_FORMAT, Locale.US)
            .format(System.currentTimeMillis())
        val contentValues = ContentValues().apply {
            put(MediaStore.MediaColumns.DISPLAY_NAME, name)
            put(MediaStore.MediaColumns.MIME_TYPE, "image/jpeg")
            if(Build.VERSION.SDK_INT > Build.VERSION_CODES.P) {
                put(MediaStore.Images.Media.RELATIVE_PATH, "Pictures/CameraX-Image")

            }
        }
        System.out.println(contentValues.toString()+".jpg")
        val imageFile = File(Environment.getExternalStorageDirectory(), ("Pictures/CameraX-Image/"+name+".jpg"))
        System.out.println((imageFile.getAbsolutePath()).toString())
        generalURI = (imageFile.getAbsolutePath().toString())


        // Create output options object which contains file + metadata
        val outputOptions = ImageCapture.OutputFileOptions
            .Builder(contentResolver,
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                contentValues)
            .build()

        // Set up image capture listener, which is triggered after photo has
        // been taken
        imageCapture.takePicture(
            outputOptions,
            ContextCompat.getMainExecutor(this),
            object : ImageCapture.OnImageSavedCallback {
                override fun onError(exc: ImageCaptureException) {
                    Log.e(TAG, "Photo capture failed: ${exc.message}", exc)
                }

                override fun
                        onImageSaved(output: ImageCapture.OutputFileResults){
                    val msg = "Photo capture succeeded: ${output.savedUri}"
                    Toast.makeText(baseContext, msg, Toast.LENGTH_SHORT).show()
                    Log.d(TAG, msg)
                    val intent = Intent(this@MainActivity7, MainActivity3::class.java)
                    startActivity(intent)
                }
            }
        )


    }

    private fun captureVideo() {}

    private fun startCamera() {
        val cameraProviderFuture = ProcessCameraProvider.getInstance(this)

        cameraProviderFuture.addListener({
            // Used to bind the lifecycle of cameras to the lifecycle owner
            val cameraProvider: ProcessCameraProvider = cameraProviderFuture.get()

            // Preview
            val preview = androidx.camera.core.Preview.Builder()
                .build()
                .also {
                    it.setSurfaceProvider(viewBinding.viewFinder.surfaceProvider)
                }

            imageCapture = ImageCapture.Builder()
                .build()

            // Select back camera as a default
            val cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA


            try {
                // Unbind use cases before rebinding
                cameraProvider.unbindAll()

                // Bind use cases to camera
                cameraProvider.bindToLifecycle(
                    this, cameraSelector, preview, imageCapture)

            } catch(exc: Exception) {
                Log.e(TAG, "Use case binding failed", exc)
            }

        }, ContextCompat.getMainExecutor(this))

    }

    private fun requestPermissions() {
        activityResultLauncher.launch(REQUIRED_PERMISSIONS)
    }

    private fun allPermissionsGranted() = REQUIRED_PERMISSIONS.all {
        ContextCompat.checkSelfPermission(
            baseContext, it) == PackageManager.PERMISSION_GRANTED
    }

    override fun onDestroy() {
        super.onDestroy()
        cameraExecutor.shutdown()
    }

    companion object {
        private const val TAG = "CameraXApp"
        private const val FILENAME_FORMAT = "yyyy-MM-dd-HH-mm-ss-SSS"
        private val REQUIRED_PERMISSIONS =
            mutableListOf (
                Manifest.permission.CAMERA,
                Manifest.permission.RECORD_AUDIO
            ).apply {
                if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.P) {
                    add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                }
            }.toTypedArray()
    }



    private val activityResultLauncher =
        registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions())
        { permissions ->
            // Handle Permission granted/rejected
            var permissionGranted = true
            permissions.entries.forEach {
                if (it.key in REQUIRED_PERMISSIONS && it.value == false)
                    permissionGranted = false
            }
            if (!permissionGranted) {
                Toast.makeText(baseContext,
                    "Permission request denied",
                    Toast.LENGTH_SHORT).show()
            } else {
                startCamera()
            }
        }

}



//Font declaration
val glacialIndifference = FontFamily(
    Font(R.font.glacialindifferencebold, FontWeight.Bold),
)

//variable declaration

typealias LumaListener = (luma: Double) -> Unit

public var personalUsernameLogIN = ""
public var personalEmailLogIN = ""
public var personalPasswordIN = ""

public var publicFigure = false
public var researchFigure = false

public var reptileLover = false
public var amphibiansLover = false
public var mammalsLover = false
public var birdLover = false
public var plantsLover = false

public var generalURI = ""
public var descriptionResult = ""

val apiKey = "AIzaSyABXDNumR5qVnSNYbKc5S7DQjKWOKgtS48"
val generativeModel = GenerativeModel(
    // For text-and-images input (multimodal), use the gemini-pro-vision model
    modelName = "gemini-pro-vision",
    // Access your API key as a Build Configuration variable (see "Set up your API key" above)
    apiKey = apiKey
)



// Greeting Development Introductions
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Dev Value: // $name",
        fontSize = 10.sp,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        modifier = modifier
    )
}

// Testbench

// Registration Page
@Composable
fun iconMainPage() {
    // Add padding around our message


    Row(Modifier.padding(start = 15.dp, top = 20.dp)) {
        Text("REGISTRATION", textAlign = TextAlign.Center, fontFamily = glacialIndifference)
    }
    Row(modifier = Modifier.padding(start = 15.dp, top = 20.dp)) {

        val image = painterResource(R.drawable.dodo500logo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                // Set image size to 40 dp
                .size(100.dp)
                // Clip image to be shaped as a circle
                .clip(CircleShape)

        )
    }
}

@Composable
fun mainPageText() {
    Column() {
        Row(Modifier.padding(start = 15.dp, top = 40.dp)) {
            Text("Log In or Create an Account", fontSize = 20.sp, fontFamily = glacialIndifference)

        }
        Row(Modifier.padding(start = 15.dp, top = 0.dp)) {
            Text("use email for login or registration",fontSize= 12.sp, fontFamily = glacialIndifference)


        }
    }
}

@Composable
fun registrationfieldInput() {
    var username_logIn by remember { mutableStateOf("") }
    var email_logIn by remember { mutableStateOf("") }
    var password_logIn by remember { mutableStateOf("") }

    Row(Modifier.padding(start = 15.dp, top = 20.dp)) {
        TextField(
            value = username_logIn,
            onValueChange = { username_logIn = it },
            label = { Text("Username") }
        )
    }
    Row(Modifier.padding(start = 15.dp, top = 20.dp)) {
        TextField(
            value = email_logIn,
            onValueChange = { email_logIn = it },
            label = { Text("Email") }
        )
    }
    Row(Modifier.padding(start = 15.dp, top = 20.dp)) {
        TextField(
            value = password_logIn,
            onValueChange = { password_logIn = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation('*'),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

        )
    }

    personalUsernameLogIN = username_logIn
    personalEmailLogIN = email_logIn
    personalPasswordIN = password_logIn

    System.out.println(personalUsernameLogIN)
    System.out.println(personalEmailLogIN)
    System.out.println(personalPasswordIN)


}

@Composable
fun registrationButton(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("Elevated")
    }
}

@Composable
fun profileButtonPublic(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {

        val image = painterResource(R.drawable.profilepublic)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                // Set image size to 40 dp
                .size(100.dp)
                // Clip image to be shaped as a circle
                .clip(CircleShape)

        )

    }
}

@Composable
fun profileButtonResearch(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        val image = painterResource(R.drawable.profileresearch)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                // Set image size to 40 dp
                .size(100.dp)
                // Clip image to be shaped as a circle
                .clip(CircleShape)

        )
    }
}

@Composable
fun reptileLoverButton (onClick: () -> Unit) {
    OutlinedButton(onClick = { onClick() },shape= CircleShape, contentPadding = PaddingValues(0.dp)) {
        val image = painterResource(R.drawable.reptilesicon)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                // Set image size to 40 dp
                .size(70.dp)
                // Clip image to be shaped as a circle
                .clip(RectangleShape)

        )
    }
}

@Composable
fun amphibiansLoverButton (onClick: () -> Unit) {
    OutlinedButton(onClick = { onClick() }, shape= CircleShape, contentPadding = PaddingValues(0.dp)) {
        val image = painterResource(R.drawable.frogicon)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                // Set image size to 40 dp
                .size(70.dp)
                // Clip image to be shaped as a circle
                .clip(RectangleShape)

        )
    }
}
@Composable
fun mammalsLoverButton (onClick: () -> Unit) {
    OutlinedButton(onClick = { onClick() }, shape= CircleShape, contentPadding = PaddingValues(0.dp)) {
        val image = painterResource(R.drawable.mammothicon)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                // Set image size to 40 dp
                .size(70.dp)
                // Clip image to be shaped as a circle
                .clip(RectangleShape)

        )
    }
}

@Composable
fun birdLoverButton (onClick: () -> Unit) {
    OutlinedButton(onClick = { onClick() }, shape= CircleShape, contentPadding = PaddingValues(0.dp)) {
        val image = painterResource(R.drawable.birdicon)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                // Set image size to 40 dp
                .size(70.dp)
                // Clip image to be shaped as a circle
                .clip(RectangleShape)

        )
    }
}
@Composable
fun plantsLoverButton (onClick: () -> Unit) {
    OutlinedButton(onClick = { onClick() }, shape= CircleShape, contentPadding = PaddingValues(0.dp)) {
        val image = painterResource(R.drawable.planticon)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                // Set image size to 40 dp
                .size(70.dp)
                // Clip image to be shaped as a circle
                .clip(RectangleShape)

        )
    }
}

@Composable
fun nextButton (onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("< NEXT >")
    }
}

//homePage
@Composable
fun profileHomeButton (onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }, contentPadding = PaddingValues(0.dp)) {
        if(publicFigure) {
            val image = painterResource(R.drawable.profilepublic)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(70.dp)
                    // Clip image to be shaped as a circle
                    .clip(CircleShape)

            )
        } else if(researchFigure) {
            val image = painterResource(R.drawable.profileresearch)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(70.dp)
                    // Clip image to be shaped as a circle
                    .clip(CircleShape)
            )
        }
    }
}

@Composable
fun BottomAppBarExample(onClick: MainActivity3, content: Context) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = {val intent = Intent(onClick, MainActivity3::class.java); startActivity(onClick, intent, null) }) {
                        Icon(Icons.Filled.Home, contentDescription = "Localized description")
                        System.out.println("Help")
                    }
                    IconButton(onClick = {val intent = Intent(onClick, MainActivity4::class.java); startActivity(onClick, intent, null) }) {
                        Icon(Icons.Filled.Check, contentDescription = "Localized description")
                        System.out.println("Help")
                    }
                    IconButton(onClick = {val intent = Intent(onClick, MainActivity5::class.java); startActivity(onClick, intent, null) }) {
                        Icon(
                            Icons.Filled.Edit,
                            contentDescription = "Localized description",
                        )
                    }
                    IconButton(onClick = {val intent = Intent(onClick, MainActivity6::class.java); startActivity(onClick, intent, null) }) {
                        Icon(
                            Icons.Filled.Mic,
                            contentDescription = "Localized description",
                        )
                    }
                    IconButton(onClick = {val intent = Intent(onClick, MainActivity7::class.java); startActivity(onClick, intent, null) }) {
                        Icon(
                            Icons.Filled.CameraAlt,
                            contentDescription = "Localized description",
                        )
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = { /* do something */ },
                        containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                        elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                    ) {
                        Icon(Icons.Filled.Add, "Localized description")
                    }
                }
            )
        },
    ) { innerPadding ->
        Text(
            modifier = Modifier.padding(innerPadding),
            text = ""
        )
    }
}

@Composable
fun ElevatedCardExample() {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 20.dp
        ),
        modifier = Modifier
            .size(width = 600.dp, height = 400.dp)
    ) {
        Text(
            text = descriptionResult,
            modifier = Modifier
                .padding(start = 10.dp),
            textAlign = TextAlign.Center,
        )
    }
}



@Preview (showBackground = true)
@Composable
fun GreetingPreview() {
    DoDoTheme {
        Greeting("DODO Prototype_1")
    }
}

//Testbench
@Preview
@Composable
fun iconMainPagePreview() {
    iconMainPage()
}

@Preview
@Composable
fun mainPageTextPreview() {
    mainPageText()
}

@Preview
@Composable
fun registrationfieldInpuPreivew() {
    registrationfieldInput()
}





