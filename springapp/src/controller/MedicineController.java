@RestController
@RequestMapping("/medicines")
public class MedicineController {

    private final MedicineService medicineService;

    public MedicineController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }

    @PostMapping
    public ResponseEntity<Boolean> addMedicine(@RequestBody Medicine medicine) {
        boolean medicineAdded = medicineService.addMedicine(medicine);
        return ResponseEntity.ok(medicineAdded);
    }

    @PutMapping("/{medicineId}")
    public ResponseEntity<Medicine> updateMedicine(@PathVariable int medicineId, @RequestBody Medicine medicine) {
        Medicine updatedMedicine = medicineService.updateMedicine(medicineId, medicine);
        return ResponseEntity.ok(updatedMedicine);
    }
}