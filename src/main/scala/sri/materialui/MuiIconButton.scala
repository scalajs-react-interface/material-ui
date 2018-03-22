package sri.materialui


import sri.core._
import sri.universal._

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import sri.web.vdom.DOMProps
import org.scalajs.dom
import scalajsplus.macros.{FunctionObjectMacro, exclude}
import scalajsplus.{OptDefault, OptionalParam, DangerousUnionToJSAnyImplicit}
import sri.web.vdom.ReactEventAliases._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
     




 @js.native
 @JSImport("material-ui/IconButton",JSImport.Default)
object MuiIconButtonComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiIconButton {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
rootRef : OptionalParam[js.Function] = OptDefault,
disableRipple : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
color : OptionalParam[MuiIconButtonColor] = OptDefault,
buttonRef : OptionalParam[MuiButtonComponent.type => _] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiIconButtonComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiIconButtonComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiIconButtonComponent.type](
      MuiIconButtonComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiIconButtonC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiIconButtonComponent.type](
      MuiIconButtonComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         
 @js.native
 trait MuiIconButtonColor extends js.Object
 
 object MuiIconButtonColor {
   @inline def DEFAULT = "default".asInstanceOf[MuiIconButtonColor] 
@inline def INHERIT = "inherit".asInstanceOf[MuiIconButtonColor] 
@inline def CONTRAST = "contrast".asInstanceOf[MuiIconButtonColor] 
@inline def ACCENT = "accent".asInstanceOf[MuiIconButtonColor] 
 } 
 
       


     

         
