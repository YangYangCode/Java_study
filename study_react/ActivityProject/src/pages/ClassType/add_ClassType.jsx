import { useState } from 'react'
import { Button, TextField } from "@mui/material";
import { post_create_classType } from "../../service/Service_AS";

const AddClassType = ({ }) => {

    const [formClassTypeInput, setFormClassTypeInput] = useState(     // From 表單
        {
            name: "",
        })

    // 修改 formASInput 的資料格式，並傳遞給後端
    const handleSubmit = async () => {
        try {
            console.log(formClassTypeInput);
            const response = await post_create_classType(formClassTypeInput);
            console.log(response);
        } catch (error) {
            console.error("Error creating class type:", error);
        }
    };


    return (

        <div className="min-h-screen flex justify-center">
            <div className="w-[90vw] p-4">
                <br></br>
                <br></br>
                <br></br>
                <h2 className="text-4xl font-bold mb-4">新增課程</h2>
                <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4">
                    {/* 教室名稱 */}
                    <TextField
                        label="課程名稱"
                        type="text"
                        name="name"
                        value={formClassTypeInput.name}
                        onChange={(event) => setFormClassTypeInput({ ...formClassTypeInput, name: event.target.value })}
                        fullWidth
                    />
                </div>

                {/* 提交按鈕 */}
                <div className="mt-6">
                    <Button variant="contained" color="primary" onClick={handleSubmit}>
                        新增課程
                    </Button>
                </div>
            </div>
        </div>
    );
};


export default AddClassType;